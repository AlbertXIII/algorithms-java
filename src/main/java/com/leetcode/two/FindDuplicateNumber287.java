package com.leetcode.two;

import java.util.HashSet;

public class FindDuplicateNumber287 {

	public static void main(String[] args) {
		System.out.println(findDuplicate(new int[] {1, 3, 4, 2, 2}));
	}
	
	static public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(!set.add(n)) return n;
            //set.forEach(System.out::println);
        }
       
        return -1;
    }

}
