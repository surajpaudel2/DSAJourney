package com.suraj.loops;

import java.util.Scanner;

public class Print1ToN {
	public static void main(String[] args) {
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			System.out.println(i);
			i ++;
		}
	}
}
