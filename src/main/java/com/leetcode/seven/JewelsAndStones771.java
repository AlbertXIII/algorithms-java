package com.leetcode.seven;

import java.util.HashSet;

public class JewelsAndStones771 {

	public static void main(String[] args) {
		System.out.println(numJewelsInStonesK("Aa", "aAAbbbb"));
		System.out.println(numJewelsInStonesN("Aa", "aAAbbbb"));
	}
	
	public static int numJewelsInStonesK(String jewels, String stones) {
        if(jewels == null || jewels.length() == 0 || stones == null || stones.length() == 0)
            return -1;
        HashSet<Character> jewelset = new HashSet<>();
        for(char c : jewels.toCharArray()){
            jewelset.add(c);
        }
        int count = 0;
        for(char c : stones.toCharArray()){
            if(jewelset.contains(c)) count++;
        }
        return count;
    }
	
	public static int numJewelsInStonesN(String jewels, String stones) {
        int res = 0;
        for(int i = 0; i < stones.length(); i++){
            if(jewels.indexOf(stones.charAt(i)) > -1) res++;
        }
        return res;
    }

}
