package com.leetcode.zero;

import java.util.Arrays;

public class PlusOne66 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] {1,2,3})));
		System.out.println(Arrays.toString(plusOne(new int[] {1,2,9})));
	}
	
	private static int[] plusOne(int[] digits) {
        
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigit = new int[digits.length + 1];
        newDigit[0] = 1;
        return newDigit;
    }

}
