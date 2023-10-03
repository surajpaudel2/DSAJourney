// LINK :- https://hack.codingblocks.com/app/contests/5054/1102/problem

package com.suraj.loops;

import java.util.Scanner;

public class IsArmstrong {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int temp = n;

	        int total_digits = 0;

	        while(n > 0) {
	            total_digits ++;
	            n = n / 10;
	        }

	        n = temp;

	        int ans = 0;
	        while(n > 0) {
	            int rem = n % 10;
	            ans = (int) (ans + (Math.pow(rem, total_digits)));
	            n = n / 10;
	        }
	        if (ans == temp) {
	            System.out.println(true);
	        }
	        else {
	            System.out.println(false);
	        }
	}
}
