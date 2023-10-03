package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		int stars = 1;
		int spaces = n -1;
		while (i <= n * 2 - 1) {
			int k = 1;
			while (k <= spaces) {
				System.out.print("  ");
				k ++;
			}
			
			int j = 1;
			while (j <= stars) {
				System.out.print("* ");
				j ++;
			}
			i ++;
			if (i >= n) {
				stars --;
				spaces ++;
			}
			else {
				stars ++;
				spaces --;
			}
			System.out.println();
		}
	}
}
