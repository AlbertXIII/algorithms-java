package com.leetcode.three;

import java.util.HashMap;

public class FirstUniqueStringChar387 {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("hello"));
		System.out.println(firstUniqCharK("hello"));
	}
	
	private static int firstUniqChar(String s) {
		if(s == null || s.length() == 0) return -1;
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(int i = 0; i < s.length(); i++){
			if(map.get(s.charAt(i)) == 1) return i;
		}
		
		return -1;
	}
	
	private static int firstUniqCharK(String s) {
		if(s == null || s.length() == 0) return -1;
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++){
			char current = s.charAt(i);
			if(!map.containsKey(current)) map.put(current, i);
			else map.put(current, -1);
		}
		
		int min = Integer.MAX_VALUE;
		for(char c: map.keySet()) {
			if(map.get(c) > -1 && map.get(c) < min) min = map.get(c);
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}

}
