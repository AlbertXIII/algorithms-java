package com.leetcode.nine;

import java.util.HashMap;

public class FruitIntoBaskets904 {

	public static void main(String[] args) {
		System.out.println(totalFruit(new int[] {1,2,3,2,2}));
	}
	
	public static int totalFruit(int[] fruits) {
        if(fruits.length == 0 || fruits == null) return -1;
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount = 0;
        int current = 0, max = 0;
        
        for(Integer fruit : fruits){
            
            if(fruit == lastFruit || fruit == secondLastFruit){
                current += 1;
            } else current = lastFruitCount + 1;
            
            
            if(fruit == lastFruit) lastFruitCount += 1;
            else lastFruitCount = 1;
            
            if(fruit != lastFruit){
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }
            
            max = Math.max(current, max);
            
        }
        
        return max;
    }
	
	public int totalFruitK(int[] fruits) {
        if(fruits.length == 0 || fruits == null) return 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        
        while(j < fruits.length){
            if(map.size() <= 2) map.put(fruits[j], j++);
            if(map.size() > 2) {
                int min = fruits.length - 1;
                for(int value : map.values()) {
                    min = Math.min(min, value);                    
                }
                i = min + 1;
                map.remove(fruits[min]);
            }
            max = Math.max(max, j - i);
        }
        
        return max;
    }

}
