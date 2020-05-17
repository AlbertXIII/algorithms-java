package com.leetcode;

public class FindPivotIndex724 {

	public static void main(String[] args) {
		System.out.println(pivotIndex(new int[] {1,7,3,6,5,6}));
	}
	
	static public int pivotIndex(int[] nums) {
        if(nums.length == 0 || nums == null) return -1;
        
        int total = 0;
        for(int n : nums){
            total += n;
        }
   
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(total - leftSum - nums[i] == leftSum) return i;
            leftSum += nums[i];
        }
        
        return -1;
        
    }

}
