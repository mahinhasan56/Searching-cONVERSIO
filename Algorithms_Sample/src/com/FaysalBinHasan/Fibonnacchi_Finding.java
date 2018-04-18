package com.FaysalBinHasan;

import java.util.Scanner;

public class Fibonnacchi_Finding {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Enter A Integer Number As Your Wish");
		int num = k.nextInt();
		System.out.println(fibonacciNumber(num));
	}

	public static int fibonacciNumber(int num) {
		if (num == -1) {
			return 1;
		} else if (num < 0) {
			return -1;
		} else if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		}
		return fibonacciNumber(num - 1) + fibonacciNumber(num - 2);
	}
}
