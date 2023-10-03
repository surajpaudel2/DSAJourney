// Link : https://hack.codingblocks.com/app/contests/5054/201/problem

/*
 	Question : 
 	
Take the following as input.
A number (N1)
A number (N2)
Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.
Input Format
Constraints
0 < N1 < 100 0 < N2 < 100
Output Format
Sample Input
10 
4
Sample Output
5 
11 
14 
17 
23 
26 
29 
35 
38 
41
Explanation
The output will've N1 terms which are not divisible by N2.
*/

package com.suraj.loops;

import java.util.Scanner;

public class PrintN1Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int N1 = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int N2 = sc.nextInt();
		
		int count = 0;
		int temp = 1;
		while(count <= N1) {
			int num = (3 * (temp ++)) + 2;
			if (num % N2 != 0) {
				System.out.println(num);
				count ++;
			}
		}
	}
}






















