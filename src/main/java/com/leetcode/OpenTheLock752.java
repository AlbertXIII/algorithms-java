package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class OpenTheLock752 {

	public static void main(String[] args) {
		System.out.println(openLock(new String[] {"0201","0101","0102","1212","2002"}, "0202"));
	}
	
	static public int openLock(String[] deadends, String target) {
	    
        HashSet<String> deadEnds = new HashSet<>(Arrays.asList(deadends));
        HashSet<String> visited = new HashSet<>();
        visited.add("0000");
        
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        
        int level = 0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size > 0){
                String lock = queue.poll();
                if(deadEnds.contains(lock)){
                    size--;
                    continue;
                }
                if(lock.equals(target)) return level;
                StringBuilder sb = new StringBuilder(lock);
                System.out.println(sb.toString());
                for(int i = 0; i < 4; i++){
                    char current = sb.charAt(i);
                    String s1 = sb.substring(0, i) + (current == '9' ? 0 : current - '0' + 1) + sb.substring(i + 1);
                    String s2 = sb.substring(0, i) + (current == '0' ? 9 : current - '0' - 1) + sb.substring(i + 1);
                    if(!visited.contains(s1) && !deadEnds.contains(s1)){
                        queue.offer(s1);
                        visited.add(s1);
                    }
                    if(!visited.contains(s2) && !deadEnds.contains(s2)){
                        queue.offer(s2);
                        visited.add(s2);
                    }
                    
                }
                size--;
            }
            level++;
        }
        return -1;
    }

}
