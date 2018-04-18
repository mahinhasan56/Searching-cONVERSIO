package com.FaysalBinHasan;

import java.util.Scanner;

public class PowerFinding2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Enter Number");
		int m = k.nextInt();
		System.out.println("Enter power");
		int n = k.nextInt();
		System.out.println(power(m, n));
	}

	public static double power(int i, int j) {
		if (j == 0) {
			return 1;
		}
		if (j % 2 == 0) {
			return (power(i, j / 2)) * (power(i, j / 2));
		}
		return (power(i, j / 2)) * (power(i, j / 2)) * i;
	}
}
