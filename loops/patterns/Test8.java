package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows number : ");
		int n = sc.nextInt();
		
		int i = 1;
		int stars = 2 * n - 1;
		int spaces = 0;
		
		while(i <= n) {
			
			int j = 0;
			while (j < spaces) {
				System.out.print("  ");
				j ++;
			}
			
			int k = 0;
			while (k < stars) {
				System.out.print("* ");
				k ++;
			}
			
			System.out.println();
			i ++;
			stars -= 2;
			spaces ++;
		}
	}
}
