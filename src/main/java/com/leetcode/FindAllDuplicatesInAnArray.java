package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		System.out.println(findDuplicates(new int[] {4,3,2,7,8,2,3,1})
				.toString());
		System.out.println(getDuplicates(new int[] {4,3,2,7,8,2,3,1})
				.toString());
	}
	
	static public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dups = new ArrayList<>();
        if(nums.length == 0) return dups;
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) dups.add(index + 1);
            nums[index] = - nums[index];
        }
        return dups;
    }
	
	static List<Integer> getDuplicates(int[] nums){
		List<Integer> dups = new ArrayList<>();
		Set<Integer> mySet = new HashSet<>();
		for(int i : nums){
			if(!mySet.add(i)) dups.add(i);
		}
		return dups;
	}

}
