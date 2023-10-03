package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		
		while (i <= n) {
			int k = i;
			while (k < n) {
				System.out.print("  ");
				k ++;
			}
			
			int j = 1;
			while (j <= 2 * i - 1) {
				if (j %2 != 0) {
					System.out.print("* ");
				}
				else {
					System.out.print("   ");
				}
				j ++;
			}
			System.out.println();
			i ++;
		}
	}
}
