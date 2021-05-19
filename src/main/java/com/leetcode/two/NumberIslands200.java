package com.leetcode.two;

public class NumberIslands200 {

	public static void main(String[] args) {
		char[][] grid = new char[][]{
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','1'}}; 
		System.out.println(numIslandsK(grid));

	}
	
	private static int numIslandsK(char[][] grid) {
		if(grid == null || grid.length == 0) return 0;
		
		int islands = 0;
		
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				if(grid[i][j] == '1') islands += dfs(grid, i, j);
			}
		}
		
		return islands;
	}
	
	private static int dfs(char[][] grid, int i, int j){
		if(i < 0 || i >= grid.length || 
		   j < 0 || j >= grid[i].length || grid[i][j] == '0') return 0;
		
		grid[i][j] = '0';
		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);
		return 1;
	}

}
