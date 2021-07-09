package com.basics;

import java.util.stream.LongStream;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(6));
		System.out.println(factorialStream(3));
		System.out.println(factorialRecursion(5));
		
		System.out.println(Math.floor(Math.sqrt(3 + 2)));
		System.out.println((int)Math.floor(Math.sqrt(3 + 2)));
	}
	
	private static Long factorial(int n) {
		long res = 1;
		for(int i = 2; i <= n; i++) {
			res = res * i;
		}
		return res;
	} 
	
	private static Long factorialStream(int n) {
		return LongStream.rangeClosed(1, n)
				.reduce(1, (long x, long y) -> x * y);
	}
	
	private static long factorialRecursion(int n) {
		if(n <= 2) return n;
		return n * factorialRecursion(n - 1);
	}

}
