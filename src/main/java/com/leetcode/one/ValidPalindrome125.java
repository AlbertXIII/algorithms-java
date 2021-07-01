package com.leetcode.one;

public class ValidPalindrome125 {

	public static void main(String[] args) {
		System.out.println(isPalindromeN("Race-Car"));
		System.out.println(isPalindromeK("Race-Car"));
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
	
	public static boolean isPalindromeK(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(l++)) != Character.toLowerCase(s.charAt(r--))) return false;
        }
        return true;
    }

}
