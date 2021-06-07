package com.leetcode.three;

import java.util.HashMap;

public class FindDifference389 {

	public static void main(String[] args) {
		System.out.println(findTheDifferenceK("abcd", "abcde"));
		System.out.println(findTheDifferenceK("wonder", "dergwon"));
	}
	
	private static char findTheDifferenceK(String s, String t) {
		HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            if(map.containsKey(c) && map.get(c) == 0 
               || !map.containsKey(c)) return c;
            else map.put(c, map.get(c) - 1);
        }
        return '!';
	}

}
