package com.basics;

public class ArrayMaxNumber {
	
	public static void main(String[] args) {
		findMaxNumber(new int[] {5, 7, 9, 2});

	}
	
	public static void findMaxNumber(int[] numbers) {
		
		int max = 0;
		
		for(int n: numbers) {
			if(max < n) {
				max = n;
			} 
		}
		
		System.out.println("Max Number " + max);
		
	}

}
