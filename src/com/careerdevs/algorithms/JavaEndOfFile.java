package com.careerdevs.algorithms;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int i=1;
        while (scanner.hasNext()) {
            System.out.println(i++ + " " + scanner.nextLine());
        }
    }

}
