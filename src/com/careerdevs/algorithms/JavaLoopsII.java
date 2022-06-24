package com.careerdevs.algorithms;

import java.util.Scanner;

public class JavaLoopsII {

    public static void run () {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            sb.setLength(0);
            for(int j=0; j<n; ++j) {
                sb.append((int) (a + b*(Math.pow(2, j+1) - 1))).append(" ");
            }
            System.out.println(sb.toString());
        }
        scan.close();

    }

}



//STARTING CODE FROM HACKERRANK
/*
import java.util.*;
        import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        }
        in.close();
    }
}
 */