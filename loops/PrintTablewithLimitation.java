package com.suraj.loops;

import java.util.Scanner;

public class PrintTablewithLimitation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		System.out.println("Enter limit : ");
		int limit = sc.nextInt();
		
		int count = 1;
		int ans = 0;
		
		while(ans < limit) {
			ans = n * count ++;
            if(ans <= limit) {
                System.out.println(ans);
            }
		}
	}
}
