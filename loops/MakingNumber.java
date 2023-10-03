package com.suraj.loops;

import java.util.Scanner;

public class MakingNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int count = 1;
	        int final_no = 0;
	        int i = 1;
	        while (i <= n) {
	            int num = sc.nextInt();
	            final_no = final_no + (num * count);
	            count *= 10;
	            i ++;
	        }

	        System.out.println(final_no);
	    }
}
