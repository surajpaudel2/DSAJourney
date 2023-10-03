package com.suraj.loops;

import java.util.Scanner;

public class PrintFibbonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int a = 0, b = 1;
		
		int i = 1;
		while (i <= n) {
			int c = a + b;
			a = b;
			b = c;
			i ++;
		}
		
		System.out.println(a);
	}
}
