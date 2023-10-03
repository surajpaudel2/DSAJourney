package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int n = sc.nextInt();
		int spaces = n * 2 - 3, stars = 1;
		
		int i = 1;
		while (i <= n) {
			
			int j = 1;
			while (j <= stars) {
				System.out.print("* ");
				j ++;
			}
			j = 1; 
			while(j <= spaces) {
				System.out.print("  ");
				j ++;
			}
			j = 1;
			while (j <= stars) {
				if (j != n) {
					System.out.print("* ");
				}
				j ++;
			}
			stars ++;
			spaces -= 2;
			System.out.println();
			i ++;
		}
	}
}
