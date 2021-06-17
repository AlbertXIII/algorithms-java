package com.leetcode.one;

public class ValidPalindrome125 {

	public static void main(String[] args) {
		System.out.println(isPalindromeN("Race-Car"));
	}
	
	private static boolean isPalindromeN(String s) {
        String alphanum = "";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c))
                alphanum += c;
        }
        alphanum = alphanum.toLowerCase();
        
        int l = 0, r = alphanum.length() - 1;
        while(l < r){
            if(alphanum.charAt(l) == alphanum.charAt(r)){
                l++;
                r--;
            }else return false;
        }
        return true;
    }

}
