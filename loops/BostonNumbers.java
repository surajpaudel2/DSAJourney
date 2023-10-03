// Link :- https://hack.codingblocks.com/app/contests/5054/495/problem

package com.suraj.loops;

import java.util.Scanner;

public class BostonNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int temp = n;
		int div = 2;
		int sum = 0;
		boolean b = false;
		while (temp > 1) {
			if (temp % div == 0) {
				
				if (div > 9) {
					int div2 = div;
					b = true;
					while (div2 > 0) {
						int r = div2 % 10;
						sum = sum + r;
						div2 = div2 / 10;
					}
				}
				temp = temp / div;
				if (!b) {
					sum = sum + div;
				}
				b = false;
			}
			else {
				div ++;
			}
//			System.out.println(div);
		}
		
		
		int org_sum = 0;
		while (n > 0) {
			org_sum = org_sum + (n % 10);
			n = n / 10;
		}
		if (org_sum == sum) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
}
