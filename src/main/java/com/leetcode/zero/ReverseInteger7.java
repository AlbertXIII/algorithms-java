package com.leetcode.zero;

public class ReverseInteger7 {

	public static void main(String[] args) {
		System.out.println(reverse(123));
	}
	
	private static int reverse(int x) {
		 boolean negative = false;
	        if(x < 0){
	            negative = true;
	            x *= -1;
	        }
	        long reverse = 0;
	        while(x > 0){
	            reverse = (reverse * 10) + (x % 10);
	            System.out.println(reverse);
	            x /= 10;
	            System.out.println("x: "+x);
	        }
	       
	        if(reverse > Integer.MAX_VALUE) return 0;
	        
	        return negative ? (int)(-1 * reverse) : (int)reverse;
	}
	
	private static int reverseN(int x) {
		int reversed = 0, pop = 0;
		while(x != 0) {
			pop = x % 10;
			x /= 10;
			
			if(reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && pop > 7) return 0;
			if(reversed < Integer.MIN_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && pop < -8) return 0;

			reversed = (reversed * 10) + pop;
		}
		return reversed;
		
	}
	
	

}
