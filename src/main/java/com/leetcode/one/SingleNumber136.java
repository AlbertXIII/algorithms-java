package com.leetcode.one;

import java.util.HashSet;

public class SingleNumber136 {

	public static void main(String[] args) {
		System.out.println(singleNumberK(new int[] {5,1,2,1,2}));
	}
	
	private static int singleNumberK(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(!set.add(n)) set.remove(n);
            else set.add(n);
        }
        for(int n: set){
            return n;
        }
        return -1;
    }

}
