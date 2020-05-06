package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder127 {

	public static void main(String[] args) {
		List<String> wordList = new ArrayList<>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		wordList.add("cog");
		System.out.println(ladderLength("hit", "cog", wordList));
	}
	
	static public int ladderLength(String beginWord, String endWord, List<String> wordList) {
	    //BFS breadth first search 
	        HashSet<String> set = new HashSet<>();
	        for(String word: wordList){
	            set.add(word);
	        }
	        
	        if(!set.contains(endWord)){
	            return 0;
	        }
	        
	        Queue<String> queue = new LinkedList<>();
	        queue.offer(beginWord);
	        int level = 1;
	        
	        while(!queue.isEmpty()){
	            for(int i = 0; i < queue.size(); i++){
	                String currentWord = queue.poll();
	                char[] chars = currentWord.toCharArray();
	                for(int j = 0; j < chars.length; j++){
	                    char origChar = chars[j];
	                    for(char c = 'a'; c < 'z'; c++){
	                        if(chars[j] == c) continue;
	                        chars[j] = c;
	                        String newWord = String.valueOf(chars);
	                        if(newWord.equals(endWord)) return level + 1;
	                        if(set.contains(newWord)){
	                            queue.offer(newWord);
	                            set.remove(newWord);
	                        }
	                    }
	                    chars[j] = origChar;
	                }
	            }
	            level++;
	        }
	        
	        return 0;
	    }

}
