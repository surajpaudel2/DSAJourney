package com.suraj.loops;

import java.util.Scanner;

public class Replace0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n1 = sc.nextInt();
		
		int n = Math.abs(n1);
		
		int sum = 0;
		while(n > 0) {
			int remainder = n % 10;
			if(remainder == 0) {
				sum = (sum * 10) + 5;
			}
			else {
				sum = (sum * 10) + remainder;
			}
			n = n / 10;
		}
		
		int finalNo = 0;
		while(sum > 0) {
			int remainder = sum % 10;
			finalNo = (finalNo * 10) + remainder;
			sum = sum / 10;
		}
		if(n1 > 0) {
			System.out.println(finalNo);
		}
		else {
			finalNo = finalNo - (finalNo * 2);
			System.out.println(finalNo);
		}
	}
}
