package com.leetcode.four;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindArrayDisappearedNumbers448 {

	public static void main(String[] args) {
		System.out.println(findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int num : nums){
            numbers.add(num);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(!numbers.contains(i)) res.add(i);
        }
        return res;
    }

}
