// Link : https://hack.codingblocks.com/app/contests/5054/100/problem

package com.suraj.loops;

import java.util.Scanner;

public class CalculateReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		long num = sc.nextInt();
		
		long reversed_number = 0;
		while (num > 0) {
			long remainder = num % 10;
			reversed_number = reversed_number * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reversed_number);
	}
}
