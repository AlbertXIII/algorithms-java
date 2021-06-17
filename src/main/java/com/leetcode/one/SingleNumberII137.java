package com.leetcode.one;

import java.util.HashMap;

public class SingleNumberII137 {

	public static void main(String[] args) {
		System.out.println(singleNumberK(new int[] {2,2,3,2}));
	}
	
	private static int singleNumberK(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int key: map.keySet()){
            if(map.get(key) == 1) return key;
        }
        
        return -1;
    }

}
