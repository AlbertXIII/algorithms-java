package com.leetcode.seven;

import java.util.Arrays;

public class FloodFill733 {

	public static void main(String[] args) {
		int image [][] = new int[][] {{1,1,1},{1,1,0},{1,0,1}};
		System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 2)));
	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		if (image == null || image.length == 0 || image[sr][sc] == newColor)
			return image;
		dfs(image, sr, sc, image[sr][sc], newColor);
		return image;
	}

	private static void dfs(int[][] image, int row, int col, int color, int newColor) {
		if (row < 0 || row >= image.length || col < 0 || col >= image[row].length || image[row][col] != color)
			return;

		image[row][col] = newColor;
		dfs(image, row + 1, col, color, newColor);
		dfs(image, row - 1, col, color, newColor);
		dfs(image, row, col + 1, color, newColor);
		dfs(image, row, col - 1, color, newColor);
	}

}
