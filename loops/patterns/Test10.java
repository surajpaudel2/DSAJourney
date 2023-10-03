package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		int stars = 1;
		while (i <= n * 2 - 1) {
			int j = 1;
			
			while (j <= stars) {
				System.out.print("* ");
				j ++;
			}
			i ++;
			if (i >= n) {
				stars --;
			}
			else {
				stars ++;
			}
			System.out.println();
		}
	}
}
