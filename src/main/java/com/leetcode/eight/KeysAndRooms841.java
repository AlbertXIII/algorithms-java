package com.leetcode.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class KeysAndRooms841 {

	public static void main(String[] args) {
		List<List<Integer>> rooms = new ArrayList<>();
		List<Integer> room1 = new ArrayList<>(List.of(1, 3));
		List<Integer> room2 = new ArrayList<>(List.of(3, 0, 1));
		List<Integer> room3 = new ArrayList<>(List.of(2));
		List<Integer> room4 = new ArrayList<>(List.of(0));
		rooms.add(room1);
		rooms.add(room2);
		rooms.add(room3);
		rooms.add(room4);
		System.out.println(canVisitAllRoomsN(rooms));
	}
	
	private static boolean canVisitAllRoomsN(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        //System.out.println(Arrays.toString(seen));
        Stack<Integer> keys = new Stack<>();
        keys.add(0);
        
        while(!keys.isEmpty()){
            int topKey= keys.pop();
            //System.out.println(topKey);
            for(int key : rooms.get(topKey)){
                if(!seen[key]){
                    seen[key] = true;
                    keys.add(key);
                }
            }
        }
        
        for(boolean visited : seen){
            if(!visited) return false;
        }
        return true;
    }

}
