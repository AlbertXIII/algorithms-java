package com.leetcode.zero;

public class RemoveElement27 {

	public static void main(String[] args) {
		//System.out.println(removeElement(new int[] {3,2,2,3}, 3));
		removeElement(new int[] {3,2,2,3}, 3);

	}
	
	static public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0 || val < 0) return -1;
        int index = 0;
        for(int n : nums) {
        	if(n != val) nums[index++] = n;
        	
        }
        for(int n : nums) {
        	System.out.println(n);
        }
        System.out.println("index " + index);
        return index;
    }
	
	

}
