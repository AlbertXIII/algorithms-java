package com.leetcode;

import java.util.Arrays;

public class IsAlienSorted953 {

	public static void main(String[] args) {
		
		System.out.println(isAlienSorted(new String[] {"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
		
	}
	
	static int[] alienOrder;
    
    public static boolean isAlienSorted(String[] words, String order) {
        
    	alienOrder = new int[26];
        
        for(int i = 0; i < order.length(); i++){
        	alienOrder[order.charAt(i) - 'a'] = i;
        }
        
        //Arrays.stream(alienOrder).forEach(System.out::println);
        
        for(int i = 1; i < words.length; i++){
            if(compare(words[i - 1], words[i]) > 0) return false;
        }
        
        return true;
    }
	
	public static int compare(String word1, String word2){
        int i = 0;
        int j = 0;
        int charCompare = 0;
        
        while(i < word1.length() && j < word2.length() && charCompare == 0){
            charCompare = alienOrder[word1.charAt(i) - 'a'] - alienOrder[word2.charAt(j) - 'a'];
            i++;
            j++;
        }
        
        if(charCompare == 0){
            return word1.length() - word2.length();
        } else {
            return charCompare;
        }
    }


}
