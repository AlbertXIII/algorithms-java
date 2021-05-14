package com.basics;

import java.util.Arrays;

public class FibonacciNumber {

	public static void main(String[] args) {
		//System.out.println(getFibonacci(9));
		System.out.println(getFib(9));
		//System.out.println(getFibo(9));
	}
	//exponential time complexity
	static int getFibonacci(int n) {
		if(n <= 1) return n;
		return getFibonacci(n-1) + getFibonacci(n-2);
	}
	
	// d p bottom-up
	static int getFib(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
	
		for(int i = 3; i <= n; i++){
			dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(Arrays.toString(dp));
		return dp[n];
	}
	
	//space optimization
	static int getFibo(int n) {
		int a = 0, b = 1, c = 0;
		if(n == 0) return a;
		for(int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

}
