package com.leetcode.zero;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber17 {

	public static void main(String[] args) {
		letterCombinations("22").forEach(System.out::println);
	}
	
	private static List<String> letterCombinations(String digits) {
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
	
	public List<String> letterCombinationsK(String digits) {
        ArrayList<String> res = new ArrayList<>();
        if(digits.length() == 0 || digits == null) return res;
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        recur(res, digits, "", 0, mapping);
        return res;
    }
    
    public void recur(List<String> res, String digits, String current, int index, String[] mapping) {
        if(index == digits.length()){
            res.add(current);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for(int i = 0; i < letters.length(); i++){
            recur(res, digits, current + letters.charAt(i), index + 1, mapping);
        }
    }

}
