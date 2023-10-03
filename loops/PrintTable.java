package com.suraj.loops;

import java.util.Scanner;

public class PrintTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int n2 = sc.nextInt();
		
		int i = 1;
		while(i <= n2) {
			System.out.println((i ++) * n1);
		}
	}
}
