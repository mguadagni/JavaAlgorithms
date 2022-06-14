package com.careerdevs.algorithms;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void run () {

        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++){
            String s1 = scan.next();
            int x = scan.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }



}
