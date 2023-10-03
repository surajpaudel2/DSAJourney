package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row : ");
		int n = sc.nextInt();
		
		int i = 0;
		int total_stars = n;
		while (i < n ) {
			
			int j = 1;
			while (j <= total_stars) {
				System.out.print("*");
				j ++;
			}
			
			System.out.println();
			total_stars --;
			i ++;
		}
	}
}
