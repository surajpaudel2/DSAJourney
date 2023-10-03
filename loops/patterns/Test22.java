package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int stars = 1;
		int count = 1;
		
		int i = 1;
		while (i <= n * 2 - 1) {
			int j = 1;
			while (j <= stars) {
				if (j % 2 == 0) {
					System.out.print("* ");
				}
				else {
					System.out.print((count) + " ");
				}
				j ++;
			}
			
			if (i < n) {
				count ++;
				stars += 2;
			}
			else {
				count --;
				stars -= 2;
			}
			
			System.out.println();
			i ++;
		}
	}
}
