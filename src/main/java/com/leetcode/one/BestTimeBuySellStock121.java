package com.leetcode.one;

public class BestTimeBuySellStock121 {

	public static void main(String[] args) {
		System.out.println(maxProfitK(new int[] {7, 1, 5, 3, 6 ,4}));
	}
	
	private static int maxProfitK(int[] prices) {
	    
        int max = 0, min = Integer.MAX_VALUE;
        //System.out.println(min);
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min) min = prices[i];
            else max = Math.max(max, prices[i] - min);
        }
        
        return max;
        
    }

}
