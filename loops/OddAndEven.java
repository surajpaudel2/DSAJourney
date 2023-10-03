package com.suraj.loops;

import java.util.Scanner;

public class OddAndEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n1 = sc.nextInt();
		
		int i = 0; 
		while (i < n1) {
			
			System.out.println("Enter number : ");
			int n = sc.nextInt();
			
			int even_sum = 0, odd_sum = 0;
			while (n > 0) {
				int remainder = n % 10;
				if(remainder % 2 == 0) {
					even_sum += remainder;
				}
				else {
					odd_sum += remainder;
				}
				n = n / 10;
			}
			if (even_sum % 4 == 0 || odd_sum % 3 == 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			i ++;
		}
	}
}
