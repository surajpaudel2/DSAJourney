package com.suraj.loops;

import java.util.Scanner;

public class PrintNoBeforeNegative {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while (true) {
			 System.out.println("Enter number : ");
			int n = sc.nextInt();
			sum = sum + n;
			if (sum < 0) {
				break;
			}
			System.out.println(n);
		}
	}
}
