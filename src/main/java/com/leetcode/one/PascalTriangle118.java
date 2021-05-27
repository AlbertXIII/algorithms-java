package com.leetcode.one;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
	
	

	public static void main(String[] args) {
		System.out.println(generate(5));
	}
	
	private static List<List<Integer>> generate(int rows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if(rows == 0) return pascal; 
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        pascal.add(row1);
        
        for(int i = 1; i < rows; i++){
            List<Integer> prev = pascal.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j < i; j++){
                row.add(prev.get(j - 1) + prev.get(j));
            }
            row.add(1);
            pascal.add(row);
        }
        
        return pascal;
    }

}
