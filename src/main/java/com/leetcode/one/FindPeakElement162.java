package com.leetcode.one;

public class FindPeakElement162 {

	public static void main(String[] args) {
		System.out.println(findPeakElement(new int[] {1,2,1,3,5,6,4}));
	}

	private static int findPeakElement(int[] nums) {
		//binary search
		int l = 0, r = nums.length - 1;
		while (l < r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] < nums[mid + 1]) l = mid + 1;
			else r = mid;
		}
		return l;
	}

}
