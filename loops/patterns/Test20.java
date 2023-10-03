package com.suraj.loops.patterns;

import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1, count = 1;
		while (i <= n) {
			int space = i;
			while (space <= n) {
				System.out.print("  ");
				space ++;
			}
			
			int j = 1;
			while (j < (2 * i)) {
				System.out.print(count + " ");
				count = j < (2 * i) / 2 || j == (2 * i) - 1 ? ++ count : -- count;
				j ++;
			}
			System.out.println();
			i ++;
		}
	}
}
