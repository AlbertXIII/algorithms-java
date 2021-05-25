package com.leetcode.eight;

import java.util.Stack;

public class BackspaceStrCompare844 {

	public static void main(String[] args) {
		System.out.println(backspaceCompareK("ab#c", "ad#c"));
		System.out.println(backspaceCompareN("ab##", "c#d#"));
	}
	
	private static boolean backspaceCompareK(String s, String t) {
        
        Stack<Character> stack = new Stack<>();
        popPush(s, stack);
        
        Stack<Character> tStack = new Stack<>();
        popPush(t, tStack);
        
        while(!stack.isEmpty()){
            char current = stack.pop();
            if(tStack.isEmpty() || tStack.pop() != current) return false;
        }
        
        return stack.isEmpty() && tStack.isEmpty();
    }
    
    private static void popPush(String s, Stack<Character> stack){
        for(char c: s.toCharArray()){
            if(c != '#') stack.push(c);
                else if(!stack.isEmpty()) stack.pop();
        }
    }

	private static boolean backspaceCompareN(String s, String t) {

		int sSkips = 0, tSkips = 0;
		int sLen = s.length() - 1, tLen = t.length() - 1;

		while (sLen >= 0 || tLen >= 0) {

			while (sLen >= 0) {
				if (s.charAt(sLen) == '#') {
					sSkips++;
					sLen--;
				} else if (sSkips > 0) {
					sLen--;
					sSkips--;
				} else
					break;
			}

			while (tLen >= 0) {
				if (t.charAt(tLen) == '#') {
					tSkips++;
					tLen--;
				} else if (tSkips > 0) {
					tLen--;
					tSkips--;
				} else
					break;
			}

			if (sLen >= 0 && tLen >= 0 && s.charAt(sLen) != t.charAt(tLen))
				return false;

			if (sLen >= 0 != sLen >= 0)
				return false;

			sLen--;
			tLen--;
		}
		return true;
	}

}
