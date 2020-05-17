package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber17 {

	public static void main(String[] args) {
		letterCombinations("22").forEach(System.out::println);
	}
	
	static public List<String> letterCombinations(String digits) {
        LinkedList<String> combs = new LinkedList<>();
        if(digits.equals("") || digits == null) return combs;
        combs.add("");
        
        String[] charMap = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        for(int i = 0; i < digits.length(); i++){
            int index = Character.getNumericValue(digits.charAt(i));
            while(combs.peek().length() == i){
                String permutation = combs.remove();
                for(char c : charMap[index].toCharArray()){
                    combs.add(permutation + c);
                }
            }
        }
        
        return combs;
        
    }

}
