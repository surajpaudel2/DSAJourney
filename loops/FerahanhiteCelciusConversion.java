package com.suraj.loops;

import java.util.Scanner;

public class FerahanhiteCelciusConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();

        while (min <= max) {
            int celcius = (int)((5.0/9.0) * (min - 32));
            System.out.println(min + "\t" + celcius);
            min += step;
        }

    }
}
