package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int right = n;
		
		while (i <= n) {
			
			int j = 1;
			while (j <= n) {
				if (j == i || j == right) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				j ++;
			}
			
			System.out.println();
			i ++;
			right --;
		}
	}
}
