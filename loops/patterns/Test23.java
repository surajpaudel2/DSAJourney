package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1, count = n;
		while (i <= n) {
			int k = i;
			
			while (k < n) {
				System.out.print("  ");
				k ++;
			}
			
			int j = 1;
			while (j <= (2 * i) - 1) {
				if (j == (2 * i) / 2) {
					System.out.print(0 + " ");
				}
				else {
					System.out.print(count+ " ");
				}
				if (j < (2 * i) / 2) {
					count ++;
				}
				else {
					count --;
				}
				j ++;
			}
			System.out.println();
			i ++;
		}
	}
}
