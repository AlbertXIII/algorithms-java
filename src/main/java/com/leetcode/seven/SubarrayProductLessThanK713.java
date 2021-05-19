package com.leetcode.seven;

public class SubarrayProductLessThanK713 {

	public static void main(String[] args) {
		System.out.println(numSubarrayProductLessThanK(new int[] {10,5,2,6}, 100));
	}
	
	static public int numSubarrayProductLessThanK(int[] nums, int k) {
		
		if(k <= 1 || nums.length == 0) return 0;
        
        int prod = 1;
        int result = 0;
        int start = 0;
        int end = 0;
        
        while(end < nums.length){
            prod *= nums[end];
            while(prod >= k){
                prod /= nums[start];
                start++;
            }
            result += end - start + 1;
            end++;
        }
        
        return result;
		
	}

}
