package com.suraj.loops;

import java.util.Scanner;

public class FindingGCD {
	public static void main(String[] args) {
		System.out.println("Enter divisor : ");
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		
		while (number > 0) {
			int remainder = number % divisor;
			if (remainder == 0) {
				break;
			}
			number = divisor;
			divisor = remainder;
		}
		System.out.println(divisor);
	}
}
