package com.codesignal;

import java.util.Arrays;

public class SortedSquaredArray {
	//fb
	public static void main(String[] args) {
		
		Arrays.stream(sortedSquaredArray(new int[] {-6, -4, -2, 5, 7}))
			.forEach(System.out::println);

	}
	
	static int[] sortedSquaredArray(int[] array) {
		
		int[] sortSqr = new int[array.length];
		
		int left = 0;
		int right = array.length - 1;
		
		for(int i = array.length -1; i >= 0; i--) {
			
			if(Math.abs(array[left]) > array[right]) {
				sortSqr[i] = array[left] * array[left];
				left ++;
			} else {
				sortSqr[i] = array[right] * array[right];
				right--;
			}
			
		}
		
		
		return sortSqr;
		
	}

}
