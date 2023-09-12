# Task 3110
# Archiver

## Archiver (13)

Let's continue our way to getting the contents of the archive file. Let's write the getFilesList() method in the class
zip file manager. It will return a list of files in the archive, or rather a list of properties of these files (class
properties FileProperties we have already implemented). So:
1. Add a List&lt;FileProperties&gt; getFilesList() throws Exception to ZipFileManager class
2. Inside the method, check if the content of zipFile is a regular file with
the appropriate method of the Files class. If it's not a file, throw a WrongZipFileException().
3. Create a list with elements of the FileProperties type, we will add file properties to it
4. Create an incoming ZipInputStream for the file from the zipFile variable. Like last time, wrap his creation
in try-with-resources
5. Loop through all the elements of the ZipEntry of the ZipInputStream
6. For each ZipEntry element, subtract its contents, otherwise we will not have information about it
size. You can't find out the size of a file in an archive without subtracting it. This is very easy to do with
using the copyData function using a temporary buffer of type ByteArrayOutputStream.
7. Get the name, size, compressed size, and compression method of the archive item. See what else is possible
learn about it.
8. Create an object of the FileProperties class using the received file data.
9. Add the created object from step 8 to the list from step 3
10. After exiting the loop, return the collected information to the calling method.


## Archiver (14)

Everything is ready to implement the execute() method of the ZipContentCommand class:
1. Display the message "Viewing archive contents."
2. Create an object of the ZipFileManager class using the getZipFileManager() method
3. Display the message "Archive contents:"
4. Get a list of archive files using the getFilesList() method
5. Print the properties of each file to the console. This is where the previously implemented method comes in handy.
toString() of the FileProperties class
6. Display the message "The contents of the archive have been read."
7. Run the program and check that the command "view the contents of the archive" works

## Archiver (15)

It's time to try to unpack something. To do this, add a public method void extractAll(Path
outputFolder) throws Exception to the ZipFileManager class. Path outputFolder is the path where we will be
unpack our archive. You already have a lot of experience with archive elements and streams. So I
I will give only hints on the implementation of this method, and you will have to think carefully about how it all works.
do:
1. Check if there is a zip file at all
2. If the outputFolder directory does not exist, then it must be created, like all folders, inside which
she lies.
3. Inside the archive, some files may lie inside folders, then the getName () method of the element
ZipEntry archive, will return not quite the name, as it might seem from the name, but a relative path
inside the archive. This relative path should be preserved even after unpacking, but already
relative to the directory where we unpacked the archive
4. Implement the execute() method of the ZipExtractCommand class, similar to the same class method
ZipCreateCommand, make the same try-catch block, just change the output messages
to the user so that he understands that now we will unpack the archive, and what you need to enter
the full name of the archive and the directory where we will unpack. Don't forget to call the extractAll method
class ZipFileManager, not createZip as it was in ZipCreateCommand
5. Run the program and enjoy the result of unpacking

Note:
To get read and write streams use Files.newInputStream(Path path), Files.newOutputStream(Path path).

## Archiver (16)

It's time to delete something from the archive. The archive is a very tricky thing, you can’t just take it like that and
delete some element inside it.
Why? Imagine that we decided to come up with our own text compression algorithm. After looking at the original
text, we see that the phrase "it's cool to be a programmer" is often found in it. We can in a place where
the second, third, Nth time our phrase occurs make a note that there was a phrase, as in line S
starting with character number K and length N, and delete the phrase itself. When we replace a lot of recurring
phrases, the text will be noticeably reduced, but will become unreadable for those who are not familiar with our compression algorithm.
We can restore this text (unzip). Now imagine that we need to remove
the part of the text referred to by the compressed fragments. In such a situation, our entire archive will cease
make sense. That's why you can't just delete part of the archive. This is a very rough description.
archiving option, in reality everything is much more complicated.
Therefore, in order to remove something from the archive, you need to create a new archive, rewrite everything into it, except
deleted files, and then replace the old archive with the newly created one.
1. Add a public method to remove files from the archive void removeFiles(List&lt;Path&gt; pathList)
throws Exception to the ZipFileManager class. pathList will be passed a list of relative paths to
files inside the archive. He must:
1.1. Throw a WrongZipFileException if the archive file does not exist.
1.2. Create a temporary archive file in the default directory using the createTempFile() method of the Files class.
1.3. Go through all the files in the original archive, check if the current file is in the list
for removal.
- If the file is in the list, display a message that we have deleted a file with such and such a name and
move to the next file.
- If the file is not in the list for deletion, overwrite it in a new archive
1.4. Replace the original archive file with a temporary one in which we have written the necessary files.
This must be done using the move() method of the Files class.
2. Add a public method void removeFile(Path path) throws Exception to the ZipFileManager class,
which will call the removeFiles method, creating a one-element list. This can be done with
the singletonList() method of the Collections class. See how it works.
3. Implement the execute() method of the ZipRemoveCommand class by creating an object of the ZipFileManager class,
by asking the user which archive and file to remove from, and calling the removeFile() method.
Everything else is the same as in other teams. The PathIsNotFoundException exception may not be caught, because method
removeFile() should not throw it.
4. Run the program and check that deleting the file from the archive works.

## Archiver (17)

The rest is nonsense. Add adding file to archive. Sounds suspicious, but that's what we are
let's do it. Adding files is similar to deleting, we create a temporary archive file, rewrite it in
it all the contents of the old archive and add new files. Then we replace the old archive file
new.
1. Add a public method void addFiles(List&lt;Path&gt; absolutePathList) throws Exception to the class
ZipFileManager where absolutePathList &ndash; list of absolute paths of the added files. This method
must:
1.1. As usual, throw a WrongZipFileException if the archive file does not exist
1.2. Create temporary archive file
1.3. Go through all the files in the original archive, overwrite each file in a new archive,
add the name of the rewritten file to some local list.
1.4. Go through the list of added files.
1.5. For each file, check if it is on the disk and if it is a regular file,
if something is wrong, throw a PathIsNotFoundException()
1.6. Check if the added file is already in the archive (use the list from p.1.3). Such
possibly if the user has already added it once.
- If the file is not in the list, add it to a new archive, display a message that such and such a file
added to the archive
- If the file is in the list, just tell the user that such a file is already in the archive
1.7. Replace the original archive file with a temporary one that already has the added
files.
2. Add a public method void addFile(Path absolutePath) throws Exception to the ZipFileManager class,
implement it by calling the addFiles() method, similar to how we did it for
deleting a file.
3. Implement the execute() method of the ZipAddCommand class: everything is as usual, but do not forget to ask
user to which archive and which file he wants to add, handle the exception
PathIsNotFoundException that can be thrown by the addFile() method.
4. Run the program and check that adding the file now works.

## Archiver (18)

You are a great student, I tweaked your code a bit, you can use this archiver for archiving
in everyday life. If you have time and desire, try to add the operation of changing the degree
archive compression!


Requirements:
1. The archiver is ready.