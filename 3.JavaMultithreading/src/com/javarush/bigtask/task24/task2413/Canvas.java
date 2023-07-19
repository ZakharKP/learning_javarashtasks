package com.javarush.bigtask.task24.task2413;

/**
 * Canvas class for rendering.
 */
public class Canvas {

	// width and height
	private int width;
	private int height;

	// matrix where we draw. symbol is a color.
	private char[][] matrix;

	public Canvas(int width, int height) {
		this.width = width;
		this.height = height;
		this.matrix = new char[height + 2][width + 2];
	}

	/**
	 * Clear the canvas
	 */
	void clear() {
		this.matrix = new char[height + 2][width + 2];
	}

	/**
	 * Print the passed shape at the specified coordinates with color c. If the
	 * passed array contains units, then on the canvas they will correspond to the
	 * characters - with.
	 */
	void drawMatrix(double x, double y, int[][] matrix, char c) {
		int height = matrix.length;
		int width = matrix[0].length;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (matrix[i][j] == 1)
					setPoint(x + j, y + i, c);
			}
		}
	}

	/**
	 * Put one point on the canvas with coordinates (x,y) and color - c.
	 */
	void setPoint(double x, double y, char c) {
		int x0 = (int) Math.round(x);
		int y0 = (int) Math.round(y);
		if (y0 < 0 || y0 >= matrix.length)
			return;
		if (x0 < 0 || x0 >= matrix[y0].length)
			return;

		matrix[y0][x0] = c;
	}

	/**
	 * Print the contents of the canvas to the screen.
	 */
	void print() {
		System.out.println();

		for (int i = 0; i < height + 2; i++) {
			for (int j = 0; j < width + 2; j++) {
				System.out.print(" ");
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public char[][] getMatrix() {
		return matrix;
	}
}
