package com.leetcode.eight;

import java.util.TreeMap;

public class HandStraights846 {

	public static void main(String[] args) {
		System.out.println(isNStraightHand(new int[] {1,2,3,6,2,3,4,7,8}, 3));
	}
	
	public static boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        
        TreeMap<Integer, Integer> cardCount = new TreeMap<>();
        for(int card : hand){
            if(!cardCount.containsKey(card)) cardCount.put(card, 1);
            else cardCount.replace(card, cardCount.get(card) + 1);
        }
        
        while(cardCount.size() > 0){
            int min = cardCount.firstKey();
            for(int card = min; card < min + groupSize; card++){
                if(!cardCount.containsKey(card)) return false;
                int count = cardCount.get(card);
                if(count == 1) cardCount.remove(card);
                else cardCount.replace(card, count - 1);
            }
        }
        return true;
    }

}
