package com.FaysalBinHasan;

import java.util.Scanner;

public class Factorial_Finding {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Enter Your Number As Your Wish");
		int num = k.nextInt();
		System.out.println(factorial(num));
	}

	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}
