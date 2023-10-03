package com.suraj.loops.patterns;

import java.util.Scanner;

public class PyramidPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 0;
		int spaces = n - 1;
		int star = 1;
		while (i < n) {
			int j = 1;
			while (j <= spaces) {
				System.out.print("  ");
				j ++;
			}
			
			int k = 1;
			while (k <= star) {
				System.out.print("* ");
				k ++;
			}
			System.out.println();
			i ++;
			star += 2;
			spaces --;
		}
	}
}
