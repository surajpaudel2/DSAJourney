package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int spaces = n - 1;
		int stars = n;
		int i = 1;
		while (i <= n * 2 - 1) {
			int j = 1;
			while (j <= spaces) {
				System.out.print("   ");
				j ++;
			}
			int k = 1;
			while (k <= stars) {
				System.out.print("*  ");
				k ++;
			}
			
			if (i < n) {
				spaces --;
				stars --;
			}
			else {
				spaces ++;
				stars ++;
			}
			
			System.out.println();
			i ++;
		}
	}
}
