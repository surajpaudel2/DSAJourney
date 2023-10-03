package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int spaces = n / 2;
		int stars = 1;
		
		int i = 1;
		while (i <= n) {
			int k = 1;
			while (k <= spaces) {
				System.out.print("  ");
				k ++;
			}
			
			int j = 1;
			while (j <= stars) {
				if (j != 1 && j != stars) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
				j ++;
			}
			if (i >= (n / 2) + 1) {
				stars -= 2;
				spaces ++;
			}
			else {
				stars += 2;
				spaces --;
			}
			System.out.println();
			i ++;
		}
	}
}
