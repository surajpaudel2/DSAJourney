// LINK :- https://hack.codingblocks.com/app/contests/5054/1314/problem

/*
Question : 
----------

Given a series of N Integers, check if it is possible to split sequence into two sequences -
s1 to si and si to sN such that first sequence is strictly decreasing and second is strictly increasing. Print true/false as output.

Input Format
First line contains a single integer N denoting the number of elements int the series.
Next N lines contain a single integer each denoting the elements of the array S.

Constraints
0 < N < 1000 Each number in sequence S is > 0 and < 1000000000

Output Format
Print boolean output - "true" or "false" defining whether the sequence is increasing - decreasing or not.

Sample Input
5 
1 
2 
3 
4 
5
Sample Output
true
Explanation
Carefully read the conditions to judge which all sequences may be valid. Don't use arrays or lists.
*/

package com.suraj.loops;

import java.util.Scanner;

public class CheckIncreasingDecreasingSequence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int prev = Integer.MAX_VALUE;
		int i = 1;
		int phase = 0; // dec phase = 0, inc phase = 1
		boolean ans = true;
		while (i <= n) {
			int curr = sc.nextInt();
			if (phase == 0 && curr > prev) {
				phase = 1;
				ans = true;
			} else if (phase == 1 && curr < prev) {
				phase = 0;
				ans = false;
			}

			if (curr == prev) {
				ans = false;
				break;
			}
			prev = curr;
			i++;
		}
		System.out.println(ans);
	}
}
