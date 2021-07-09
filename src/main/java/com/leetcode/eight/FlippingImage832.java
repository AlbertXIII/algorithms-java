package com.leetcode.eight;

import java.util.Arrays;

public class FlippingImage832 {

	public static void main(String[] args) {
		int[][] image = new int[][] {{1,1,0},{1,0,1},{0,0,0}};
		System.out.println(Arrays.toString(flipAndInvertImage(image)));
	}

	public static int[][] flipAndInvertImage(int[][] image) {
		for (int i = 0; i < image.length; i++) {
			int j = 0, k = image.length - 1;
			while (j < k) {
				int tmp = image[i][j];
				image[i][j++] = image[i][k];
				image[i][k--] = tmp;
			}
			for (j = 0; j < image[i].length; j++) {
				image[i][j] = image[i][j] == 1 ? 0 : 1;
			}
		}
		return image;
	}

}
