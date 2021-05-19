package com.leetcode.seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionLabels763 {

	public static void main(String[] args) {
		System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
		System.out.println(amazon(str2CharList("ababcbacadefegdehijhklij")));
	}
	
	static public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> parts = new ArrayList<>();
        if(s.length() == 0 || s == null) return parts;
        
        int[] lastIndexs = new int[26];
        for(int i = 0; i < s.length(); i++){
        	//System.out.println("i: " + i);
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
	
	static public List<Integer> amazon(List<Character> s) {
        ArrayList<Integer> parts = new ArrayList<>();
        if(s.size() == 0 || s == null) return parts;
        
        int[] lastIndexs = new int[26];
        int index = 0;
        for(Character c: s){
        	//System.out.println("c: " + index);
            lastIndexs[c - 'a'] = index++;
        }
        //Arrays.stream(lastIndexs).forEach(System.out::println);
        int start = 0;
        int end = 0;
        
        int index2 = 0;
        for(Character c: s){
            end = Math.max(end, lastIndexs[c - 'a']);
            if(index2 == end){
                parts.add(end - start + 1);
                start = end + 1;
            }
            index2++;
        }
        
        return parts;
    }
	
	static private List<Character> str2CharList(String str){
		return str
				.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.toList());
	}

}
