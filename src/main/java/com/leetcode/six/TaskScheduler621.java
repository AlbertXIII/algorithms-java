package com.leetcode.six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TaskScheduler621 {

	public static void main(String[] args) {
		System.out.println(leastInterval(new char[] {'A','A','A','B','B','B'}, 2));
	}

	public static int leastInterval(char[] tasks, int n) {
		int[] alpha = new int[26];

		for (char c : tasks) {
			alpha[c - 'A']++;
		}

		Arrays.sort(alpha);
		int max = alpha[25] - 1;
		int idleSlots = max * n;

		for (int i = 24; i >= 0; i--) {
			idleSlots -= Math.min(alpha[i], max);
		}

		return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;

	}
	
	 public int leastIntervalK(char[] tasks, int n) {
	        HashMap<Character, Integer> map = new HashMap<>();
	        
	        for(char task : tasks){
	            map.put(task, map.getOrDefault(task, 0) + 1);
	        }
	        
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
	        maxHeap.addAll(map.values());
	        int cycles = 0;
	        while(!maxHeap.isEmpty()){
	            ArrayList<Integer> tmp = new ArrayList<>();
	            for(int i = 0; i < n + 1; i++){
	                if(!maxHeap.isEmpty()) tmp.add(maxHeap.remove());
	            }
	            for(int i : tmp){
	                if(--i > 0) maxHeap.add(i);
	            }
	            cycles += maxHeap.isEmpty() ? tmp.size() : n + 1;
	        }
	        return cycles;
	    }

}
