// LINK :- https://hack.codingblocks.com/app/contests/5054/399/problem

/*
 Question : 
 -----------
 Take sb (source number system base), db (destination number system base) and sn (number in source format). Write a function that converts sn to its counterpart in destination number system. Print the value returned.

Input Format
Constraints
0 < N <= 1000000000
sb and db <= 10

Output Format
Sample Input
8
2 
33
Sample Output
11011
Explanation
All input output is as integers and in separate lines.
 */

package com.suraj.loops;

import java.util.*;
public class ConversionFromAnyToAnyNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int no = sc.nextInt();
        int decimal = 0;
        int power = 0;

        while (no > 0) {
            int rem = no % 10;
            decimal = decimal + (rem * (int) (Math.pow(sb, power)));
            no = no / 10;
            power ++;
        }

        int ans = 0;
        power = 1;
        while (decimal > 0) {
            int rem = decimal % db;
            ans = ans + (rem * power);
            power *= 10;
            decimal = decimal / db;
        }

        System.out.println(ans);
    }
}