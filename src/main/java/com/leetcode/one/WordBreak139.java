package com.leetcode.one;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak139 {

	public static void main(String[] args) {
		System.out.println(wordBreak("leetcode", Arrays.asList("leet","code")));
	}
	
	private static boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        Set<String> words = new HashSet<>(wordDict);
        for(int low = 0; low < len; low++){
            if(!dp[low]) continue;
            for(String word : wordDict){
                int hi = low + word.length();
                if(hi <= len && s.substring(low, hi).equals(word)) 
                    dp[hi] = true;
            }
        }
        return dp[len];
    }

}
