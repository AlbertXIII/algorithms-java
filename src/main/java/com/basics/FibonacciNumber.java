package com.basics;

public class FibonacciNumber {

	public static void main(String[] args) {
		System.out.println(getFibonacci(9));
		System.out.println(getFib(9));
		System.out.println(getFibo(9));

	}
	//exponential time complexity
	static int getFibonacci(int n) {
		if(n <= 1) return n;
		return getFibonacci(n-1) + getFibonacci(n-2);
	}
	
	// d p
	static int getFib(int n) {
		int[] f = new int[n+2];
		f[0] = 0;
		f[1] = 1;
	
		for(int i = 2; i <= n; i++){
			f[i] = f[i-1] + f[i-2];
		}
		
		return f[n];
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
