package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				if (j == n - i + 1) {
					System.out.print("*  ");
				}
				else {
					System.out.print(n - j + 1 + "  ");
				}
				j ++;
			}
			i ++;
			System.out.println();
		}
	}
}
