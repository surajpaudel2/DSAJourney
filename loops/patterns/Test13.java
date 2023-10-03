package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int stars = (n / 2);
			int spaces = 1;

			int i = 1;
			while (i <= n) {
				if (i != (n/ 2 + 1)) {
					int j = 1;
					while (j <= stars) {
						System.out.print("* ");
						j ++;
					}
					
					int l = 1;
					while (l <= spaces) {
						System.out.print("  ");
						l ++;
					}
					
					int k = 1;
					while (k <= stars) {
						System.out.print("* ");
						k ++;
					}
				}
				
				if (i <= n / 2) {
					stars --;
					spaces += 2;
				}
				else {
					stars ++ ;
					spaces -= 2;
				}
				
				i ++;
				System.out.println();
			}
		}
	}
}
