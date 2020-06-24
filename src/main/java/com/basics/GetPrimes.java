package com.basics;

public class GetPrimes {

	public static void main(String[] args) {
		getPrimes(20);
	}

	private static void getPrimes(int nums) {
		int ct = 0, n = 0, i = 1, j = 1;
		while (n < nums) {
			j = 1;
			ct = 0;
			while (j <= i) {
				if (i % j == 0)
					ct++;
					j++;
			}
			if (ct == 2) {
				System.out.printf("%d ", i);
				n++;
			}
			i++;
		}
	}

}
