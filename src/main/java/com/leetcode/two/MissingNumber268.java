package com.leetcode.two;

import java.util.HashSet;

public class MissingNumber268 {

	public static void main(String[] args) {
		System.out.println(missingNumberK(new int[] {1,2,3,4,6,0}));
		System.out.println(missingNumberK2(new int[] {1,2,3,4,6,0}));
	}
	
	private static int missingNumberK(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
       
       HashSet<Integer> set = new HashSet<>();
       
       for(int i : nums){
           set.add(i);
       }
       
       for(int i = 0; i <= nums.length; i++){
           if(!set.contains(i)) return i;
       }
       
       return -1;
   }
	
	private static int missingNumberK2(int[] nums) {
		int sum = 0;
		for(int i : nums) {
			sum += i;
		}
		int n = nums.length + 1;
		return (n * (n - 1) / 2) - sum;
	}

}
