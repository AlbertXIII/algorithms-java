package com.leetcode.six;

public class RobotReturnOrigin657 {

	public static void main(String[] args) {
		System.out.println(judgeCircleN("UDUDLR"));

	}
	
	private static boolean judgeCircleN(String moves) {
        if(moves == null || moves.length() == 0) return false;
        int x = 0, y = 0;
        for(char move : moves.toCharArray()){
            if(move == 'U') y++;
            if(move == 'D') y--;
            if(move == 'L') x--;
            if(move == 'R') x++;
        }
        return x == 0 && y == 0;
    }

}
