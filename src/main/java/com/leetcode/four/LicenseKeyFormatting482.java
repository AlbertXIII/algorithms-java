package com.leetcode.four;

import java.util.Stack;

public class LicenseKeyFormatting482 {

	public static void main(String[] args) {
		System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));

	}
	
	// google O(n) O(1)
    static public String licenseKeyFormatting(String s, int k) {
        if(s == null || s.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        int i = s.length() - 1;
        while(i >= 0){
            char current = Character.toUpperCase(s.charAt(i));
            if(current == '-') 
                i--;
            else if (count != 0 && count == k){
                sb.insert(0, '-');
                stack.push('-');
                count = 0;
            } else {
            	//System.out.println(sb.toString());
            	stack.push(current);
                sb.insert(0, current);
                count++;
                i--;
            }
        }
        System.out.println(stack.toString());
        return sb.toString();
    }

}
