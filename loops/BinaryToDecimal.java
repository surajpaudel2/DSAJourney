package com.suraj.loops;
import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long decimal = 0;
        long count = 1;
        while (n > 0) {
            long rem = n % 10;
            decimal = decimal + (rem * count);
            count = count * 2;
            n = n / 10;
        }

        System.out.println(decimal);
    }
}
