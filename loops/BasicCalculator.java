package com.suraj.loops;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch = 'a';
		do {
			// System.out.println("Enter ch");
			ch = sc.next().charAt(0);

			if (ch == 'x' || ch == 'X') {
				return;
			}
			if (ch != '/' && ch != '*' && ch != '-' && ch != '+' && ch != '%') {
				System.out.println("Invalid operation. Try again.");
				continue;
			}
			// System.out.println("Enter first : ");
			long first_num = sc.nextLong();
			// System.out.println("Enter second : ");
			long second_num = sc.nextLong();

			switch (ch) {
			case '+':
				System.out.println(first_num + second_num);
				break;
			case '-':
				System.out.println(first_num - second_num);
				break;
			case '*':
				System.out.println(first_num * second_num);
				break;
			case '/':
				System.out.println(first_num / second_num);
				break;
			case '%':
				System.out.println(first_num % second_num);
				break;
			}
		} while (ch != 'x' || ch != 'X');
	}
}
