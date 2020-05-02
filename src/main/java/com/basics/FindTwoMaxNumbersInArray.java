package com.basics;

public class FindTwoMaxNumbersInArray {

	public static void main(String[] args) {
		findTwoMaxNumbers(new int[] {5, 7, 9, 2});

	}
	
	public static void findTwoMaxNumbers(int[] numbers) {
		
		int max1 = 0;
		int max2 = 0;
		
		for(int n: numbers) {
			if(max1 < n) {
				max2 = max1;
				max1 = n;
			} else if(max2 < n) {
				max2 = n;
			}
		}
		
		System.out.println(max1 + " " + max2);
		
	}

}
