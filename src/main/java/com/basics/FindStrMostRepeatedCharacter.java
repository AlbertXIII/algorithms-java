package com.basics;

import java.util.HashMap;
import java.util.Map;

public class FindStrMostRepeatedCharacter {

	public static void main(String[] args) {
		System.out.println(getMostRepeatedChar("holaooola"));
	}
	
	private static char getMostRepeatedChar(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) 
				map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
			else map.put(s.charAt(i), 1);
		}
		int value = 0;
		char key = 0;
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			if(value < entry.getValue()) {
				value = entry.getValue();
				key = entry.getKey();
			}
		}
		System.out.println(key + " char is the most repeated: " + value);
		return key;
		
	}

}
