package com.suraj.loops;

import java.util.Scanner;

public class RevisingQuarditicEquation {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();

	        int D = (int) Math.pow(b, 2) - (4 * a * c);

	        if (D > 0) {
	            // Real and Distinct Roots
	            int sqr1 = (int) ((-b + Math.sqrt(D)) / (2 * a));
	            int sqr2 = (int) ((-b - Math.sqrt(D)) / (2 * a));

	            System.out.println("Real and Distinct");
	            System.out.println(sqr1 + " " + sqr2);
	        } else if (D == 0) {
	            // Real and Equal Roots
	            int sqr = (int) (-b / (2 * a));

	            System.out.println("Real and Equal");
	            System.out.println(sqr + " " + sqr);
	        } else {
	            // Imaginary Roots
	            System.out.println("Imaginary");
	        }
		
	}
}
