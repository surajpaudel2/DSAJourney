package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int stars = (n / 2) + 1, spaces = -1;
		
		int i = 1;
		while (i <= n) {
			if (i == 1 || i == n || i == ((n / 2) + 1)) {
				if (i == (n/2) + 1) {
					int j = 1;
					while (j <= n) {
						if (j == 1 || j == n) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
						j ++;
					}
				}
				else {
					int j = 1;
					while (j <= n) {
						System.out.print("* ");
						j ++;
					}
				}
			}
			else {
				int j = 1;
				while (j <= stars) {
					System.out.print("* ");
					j ++;
				}
				
				int k = 1;
				while (k <= spaces) {
					System.out.print("  ");
					k ++;
				}
				j = 1;
				while (j <= stars) {
					System.out.print("* ");
					j ++;
				}
			}
			
			if (i <= n / 2) {
				spaces += 2;
				stars --;
			}
			else {
				spaces -= 2;
				stars ++;
			}
			
			System.out.println();
			i ++;
		}
	}
}
