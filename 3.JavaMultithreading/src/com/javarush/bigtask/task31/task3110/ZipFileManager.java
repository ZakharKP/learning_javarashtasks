package com.javarush.bigtask.task31.task3110;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import com.javarush.bigtask.task31.task3110.exception.PathIsNotFoundException;
import com.javarush.bigtask.task31.task3110.exception.WrongZipFileException;

public class ZipFileManager {
	// Full path of the zip file
	private final Path zipFile;

	public ZipFileManager(Path zipFile) {
		this.zipFile = zipFile;
	}

	public void createZip(Path source) throws Exception {
		// Check if the directory where the archive will be created exists
		// If necessary, create it
		Path zipDirectory = zipFile.getParent();
		if (Files.notExists(zipDirectory))
			Files.createDirectories(zipDirectory);

		// Create a zip stream
		try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile))) {

			if (Files.isDirectory(source)) {
				// If we archive a directory, then we need to get a list of files in it
				FileManager fileManager = new FileManager(source);
				List<Path> fileNames = fileManager.getFileList();

				// Add each file to the archive
				for (Path fileName : fileNames)
					addNewZipEntry(zipOutputStream, source, fileName);

			} else if (Files.isRegularFile(source)) {

				// If we archive a separate file, then we need to get its directory and name
				addNewZipEntry(zipOutputStream, source.getParent(), source.getFileName());
			} else {

				// If the given source is neither a directory nor a file, throw an exception
				throw new PathIsNotFoundException();
			}
		}
	}

	public void extractAll(Path outputFolder) throws Exception {
		// Check if the zip file exists
		if (!Files.isRegularFile(zipFile)) {
			throw new WrongZipFileException();
		}

		try (ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(zipFile))) {
			// Create output directory if it doesn't exist
			if (Files.notExists(outputFolder))
				Files.createDirectories(outputFolder);

			// Loop through the contents of the zip stream (file)
			ZipEntry zipEntry = zipInputStream.getNextEntry();

			while (zipEntry != null) {
				String fileName = zipEntry.getName();
				Path fileFullName = outputFolder.resolve(fileName);

				// Create the necessary directories
				Path parent = fileFullName.getParent();
				if (Files.notExists(parent))
					Files.createDirectories(parent);

				try (OutputStream outputStream = Files.newOutputStream(fileFullName)) {
					copyData(zipInputStream, outputStream);
				}
				zipEntry = zipInputStream.getNextEntry();
			}
		}
	}

	public void removeFile(Path path) throws Exception {
		removeFiles(Collections.singletonList(path));
	}

	public void removeFiles(List<Path> pathList) throws Exception {

		// Check if the zip file exists
		if (!Files.isRegularFile(zipFile)) {
			throw new WrongZipFileException();
		}

		// Create a temporary file
		Path tempZipFile = Files.createTempFile(null, null);

		try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(tempZipFile))) {
			try (ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(zipFile))) {

				ZipEntry zipEntry = zipInputStream.getNextEntry();
				while (zipEntry != null) {

					Path archivedFile = Paths.get(zipEntry.getName());

					if (!pathList.contains(archivedFile)) {
						String fileName = zipEntry.getName();
						zipOutputStream.putNextEntry(new ZipEntry(fileName));

						copyData(zipInputStream, zipOutputStream);

						zipOutputStream.closeEntry();
						zipInputStream.closeEntry();
					} else {
						ConsoleHelper
								.writeMessage(String.format("Файл '%s' удален из архива.", archivedFile.toString()));
					}
					zipEntry = zipInputStream.getNextEntry();
				}
			}
		}

		// Move the temporary file to the place of the original
		Files.move(tempZipFile, zipFile, StandardCopyOption.REPLACE_EXISTING);
	}

	public void addFile(Path absolutePath) throws Exception {
		addFiles(Collections.singletonList(absolutePath));
	}

	public void addFiles(List<Path> absolutePathList) throws Exception {
		// Check if the zip file exists
		if (!Files.isRegularFile(zipFile)) {
			throw new WrongZipFileException();
		}

		// Create a temporary file
		Path tempZipFile = Files.createTempFile(null, null);
		List<Path> archiveFiles = new ArrayList<>();

		try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(tempZipFile))) {
			try (ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(zipFile))) {

				ZipEntry zipEntry = zipInputStream.getNextEntry();
				while (zipEntry != null) {
					String fileName = zipEntry.getName();
					archiveFiles.add(Paths.get(fileName));

					zipOutputStream.putNextEntry(new ZipEntry(fileName));
					copyData(zipInputStream, zipOutputStream);

					zipInputStream.closeEntry();
					zipOutputStream.closeEntry();

					zipEntry = zipInputStream.getNextEntry();
				}
			}

			// Archive new files
			for (Path file : absolutePathList) {
				if (Files.isRegularFile(file)) {
					if (archiveFiles.contains(file.getFileName()))
						ConsoleHelper
								.writeMessage(String.format("Файл '%s' уже существует в архиве.", file.toString()));
					else {
						addNewZipEntry(zipOutputStream, file.getParent(), file.getFileName());
						ConsoleHelper.writeMessage(String.format("Файл '%s' добавлен в архиве.", file.toString()));
					}
				} else
					throw new PathIsNotFoundException();
			}
		}

		// Move the temporary file to the place of the original
		Files.move(tempZipFile, zipFile, StandardCopyOption.REPLACE_EXISTING);
	}

	public List<FileProperties> getFilesList() throws Exception {
		// Check if the zip file exists
		if (!Files.isRegularFile(zipFile)) {
			throw new WrongZipFileException();
		}

		List<FileProperties> files = new ArrayList<>();

		try (ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(zipFile))) {
			ZipEntry zipEntry = zipInputStream.getNextEntry();

			while (zipEntry != null) {

				// The "size" and "compressed size" fields are not known until the element is
				// read
				// Let's subtract it to some output stream
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				copyData(zipInputStream, baos);

				FileProperties file = new FileProperties(zipEntry.getName(), zipEntry.getSize(),
						zipEntry.getCompressedSize(), zipEntry.getMethod());
				files.add(file);
				zipEntry = zipInputStream.getNextEntry();
			}
		}

		return files;
	}

	private void addNewZipEntry(ZipOutputStream zipOutputStream, Path filePath, Path fileName) throws Exception {
		Path fullPath = filePath.resolve(fileName);
		try (InputStream inputStream = Files.newInputStream(fullPath)) {
			ZipEntry entry = new ZipEntry(fileName.toString());

			zipOutputStream.putNextEntry(entry);

			copyData(inputStream, zipOutputStream);

			zipOutputStream.closeEntry();
		}
	}

	private void copyData(InputStream in, OutputStream out) throws Exception {
		byte[] buffer = new byte[8 * 1024];
		int len;
		while ((len = in.read(buffer)) > 0) {
			out.write(buffer, 0, len);
		}
	}
}
