//Link : https://hack.codingblocks.com/app/contests/5054/77/problem

package com.suraj.loops;

import java.util.Scanner;

public class PrintingPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		
		int i = 2;
		while(i <= number) {
			boolean b = true;
			int j = 2;
			
			while(j < i) {
				if((i % j) == 0) {
					b = false;
					break;
			    }
				j ++;
	       }
			if(b) {
				System.out.println(i);
			}
			
			i ++;
		}
	}
}
