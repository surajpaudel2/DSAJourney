//LINK : https://hack.codingblocks.com/app/contests/5054/132/problem

/*
 Question : - 
 ------------
 -------------
Luke  kywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.

Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.

Input Format
The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.

Constraints
x <= 100000000000000000

Output Format
Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.

Sample Input
4545
Sample Output
4444
Explanation
There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than or greater than the original digit. If it is less, then invert it otherwise leave it.
 
 */

package com.suraj.loops;

import java.util.*;

public class ChewabaccaAndNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long place = 1;
		long ans = 0;
		while (n > 0) {
			long remainder = n % 10;
			if (remainder > 4 && n != 9) {
				remainder = 9 - remainder;
			}
			ans = ans + (remainder * place);
			place = place * 10;
			n = n / 10;
		}
		System.out.println(ans);
	}
}
