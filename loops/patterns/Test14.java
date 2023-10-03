package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter rows : ");
			int n = sc.nextInt();
			int stars = 1, spaces = n - 1;
			
			int i = 1;
			while (i <= n) {
				int j = 1;
				
				while (j <= spaces) {
					System.out.print("  ");
					j ++;
				}
				int k = 1;
				while (k <= stars) {
					System.out.print("* ");
					k ++;
				}
				
				if (i >= (n / 2 + 1)) {
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
}
