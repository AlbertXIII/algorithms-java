package com.leetcode;

public class LongestCommonPrefix14 {

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
	}
	
	static public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
        	System.out.println(strs[i] + " indexOf: " + strs[i].indexOf(prefix));
            while(strs[i].indexOf(prefix) != 0){
            	//System.out.println("while");
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

}
