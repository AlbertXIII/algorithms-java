package com.basics;

public final class ArrayMinNumber {

	public static void main(String[] args) {
		int[] nums = {1,3,-4,-7, 10};

		int min = 0;
		
		for(int i : nums) {
			if(i < min) min = i;
		}
		System.out.println("Min: " + min);
	}

}
