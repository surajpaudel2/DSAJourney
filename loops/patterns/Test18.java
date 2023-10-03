package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), spaces = -1, stars = n;
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= stars) {
				System.out.print("* ");
				j ++;
			}
			j = 1;
			while (j <= spaces) {
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
			
			stars --;
			spaces += 2;
			i ++;
			System.out.println();
		}
	}
}
