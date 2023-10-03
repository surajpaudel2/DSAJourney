// Link :- https://hack.codingblocks.com/app/contests/5054/3309/problem

package com.suraj.loops;

import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int no = sc.nextInt();
		
//		--------------------FIRST APPROACH------------------------
		
//		while (no %2 == 0 || no %3 == 0) {
//			if(no %2 == 0) {
//				System.out.print(2 + " ");
//				no = no / 2;
//			}
//			else if(no %3 == 0) {
//				System.out.print(3 + " ");
//				no /= 3;
//			}
//		}
//		if (no != 1) {
//			System.out.println(no);
//		}
		
//		-----------------------Second Approach : --------------------
		
		int div = 2;
		while (no > 1) {
			if(no % div == 0) {
				System.out.println(div); 
				no = no / div;
			}
			else {
				div ++;
			}
		}
	}
}
