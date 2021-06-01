package com.leetcode.nine;

import java.util.Arrays;

public class DIStringMatch942 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(diStringMatchN("IDID")));
	}
	
	private static int[] diStringMatchN(String s) {
        int size = s.length(), low= 0, high = size;
        int[] res = new int[size + 1];
        
        for(int i = 0; i < size; i++){
            if(s.charAt(i) == 'I') res[i] = low++;
            else res[i] = high--;
        }
        
        res[size] = high;
        return res;
    }

}
