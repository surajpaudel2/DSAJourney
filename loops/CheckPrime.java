package com.suraj.loops;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		boolean b = false;
		int i = 2;
		
		while(i < num) {
			if(num % i == 0) {
				b = true;
				break;
			}
			i ++;
		}
		String prime = (b) ? "Not Prime" : "Prime";
		
		System.out.println(prime);
	} 
}
