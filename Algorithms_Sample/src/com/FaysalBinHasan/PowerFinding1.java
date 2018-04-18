package com.FaysalBinHasan;

import java.util.Scanner;

public class PowerFinding1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Enter Number ");
		int m = k.nextInt();
		System.out.println("Enter power");
		int n = k.nextInt();
		System.out.println(power(m, n));
	}

	public static int power;

	public static int power(int i, int j) {
		power++;
		if (j == 0) {
			return j;
		}
		if (power >= j) {
			return i;
		}
		return i * power(i, j);
	}
}
