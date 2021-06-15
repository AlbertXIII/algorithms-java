package com.leetcode.one;

public class BestTimeBuySellStockII122 {

	public static void main(String[] args) {
		System.out.println(maxProfitK(new int[] {7,1,5,3,6,4}));
	}
	
	private static int maxProfitK(int[] prices) {
        if(prices == null || prices.length == 0) return 0;  
        int profit = 0;
        
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i + 1] > prices[i])
                profit += prices[i + 1] - prices[i];
        }
        
        return profit;
    }

}
