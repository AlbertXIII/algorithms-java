package com.leetcode.zero;

public class PalindromeNumber9 {

	public static void main(String[] args) {
		System.out.println(isPalindromeN(-565));

	}
	
	private static boolean isPalindromeN(int x) {
        if(x == 0) return true;
        if(x < 0 || x % 10 == 0) return false;
        int reverse = 0;
        while(x > reverse){
            int pop = x % 10;
            x /= 10;
            reverse = (reverse * 10) + pop;
        }
        if(x == reverse || x == reverse / 10) return true;
        else return false;
        
    }

}
