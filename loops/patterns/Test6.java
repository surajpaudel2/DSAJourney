package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int space = 0;
		int star = n;
		
		while (i <= n) {
			int j = 0;
			while (j < space) {
				System.out.print("  ");
				j ++;
			}
			int k = 0;
			while (k < star) {
				System.out.print("* ");
				k ++;
			}
			System.out.println();
			space += 2;
			star -= 1;
			i ++;
		}
	}
}
