package com.codesignal;

import java.util.Arrays;

public class FindLongestSubArrayBySum {
	//fb
	public static void main(String[] args) {
		
		Arrays
			.stream(findLongestSubArrayBySum(15, new int[] {1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10}))
			.forEach(System.out::println);
	}
	
	static int[] findLongestSubArrayBySum(int s, int[] arr) {
		
		int[] result = new int[] {-1};
		
		int sum = 0;
		int left = 0;
		int right = 0;
		
		while(right < arr.length) {
			
			sum += arr[right];
			
			while(left < right && sum > s) {
				sum -= arr[left++];
			}
			
			if(sum == s && (result.length == 1 || result[1] - result[0] < right -left)) {
				result = new int[] {left + 1, right + 1};
			}
			
			right++;
			
		}
		
		return result;
		
	}

}
