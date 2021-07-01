package com.leetcode.eight;

public class MonotonicArray896 {

	public static void main(String[] args) {
		System.out.println(isMonotonic(new int[] {1,2,2,3}));
	}
	
	public static boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] > nums[i + 1]) inc = false;
            if(nums[i] < nums[i + 1]) dec = false;
            if(inc == false && dec == false) return false;
        }
        
        return inc || dec;
    }

}
