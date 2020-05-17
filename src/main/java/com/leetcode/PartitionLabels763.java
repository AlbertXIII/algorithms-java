package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionLabels763 {

	public static void main(String[] args) {
		System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
	}
	
	static public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> parts = new ArrayList<>();
        if(s.length() == 0 || s == null) return parts;
        
        int[] lastIndexs = new int[26];
        for(int i = 0; i < s.length(); i++){
            lastIndexs[s.charAt(i) - 'a'] = i;
        }
        Arrays.stream(lastIndexs).forEach(System.out::println);
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < s.length(); i++){
            end = Math.max(end, lastIndexs[s.charAt(i) - 'a']);
            if(i == end){
                parts.add(end - start + 1);
                start = end + 1;
            }
        }
        
        return parts;
    }

}
