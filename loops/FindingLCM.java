package com.suraj.loops;

import java.util.Scanner;

public class FindingLCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2");
		int n2 = sc.nextInt();
		
		int lcm = 1;
		
		if(n1 > 3 && n2 > 3) {
			while(   ((n1 %2) == 0 && (n2 % 2) == 0 )    ||     ((n1 % 3) == 0 && (n2 % 3) == 0 )  ) {
				
				if (n1 % 2 == 0) {
					lcm *= 2;
					n1 /= 2;
					n2 /= 2;
				}
				else {
					lcm *= 3;
					n2 /= 3;
					n1 /= 3;
				}
			}
			lcm = lcm * n1 * n2;
		}
		
		System.out.println(lcm);
	}
}
