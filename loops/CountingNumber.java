// link : https://hack.codingblocks.com/app/contests/5054/64/problem

package com.suraj.loops;
import java.util.Scanner;

public class CountingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println("Enter digit : ");
		int digit = sc.nextInt();
		
		int count = 0;
		
		while(num > 0) {
			int remainder = num % 10;
			if(remainder == digit) {
				count ++;
			}
			num = num / 10;
		}
		System.out.println(count);
	}
}
