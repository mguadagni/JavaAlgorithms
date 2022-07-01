package com.careerdevs;

import com.careerdevs.algorithms.JavaDatatypes;
import com.careerdevs.algorithms.JavaEndOfFile;
import com.careerdevs.algorithms.JavaLoopsII;
import com.careerdevs.algorithms.JavaOutputFormatting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(getFirstValue(new int[]{1, 2, 3, 4}));
//        System.out.println(Main.addition(3));
//        System.out.println(Main.search(new int[]{1, 2, 3, 4}, 3));
//        System.out.println(convert(6));
//        System.out.println(giveMeSomething("Michael"));
//        System.out.println(reverse(false));
//        System.out.println(countWords("Hello my name is Michael Guadagni."));
//        System.out.println(existsHigher(new int[] {5, 3, 15, 22, 4}, 25));
//        System.out.println(getCount("Celebration"));
//        System.out.println(sum(3, 2));
//        System.out.println(isSameNum(2,2));
//        System.out.println(calcAge(10));
//        System.out.println(helloName("Gerald"));
//        System.out.println(reverse("Hello my name is Michael Guadagni."));
//        System.out.println(makesTen(1,9));
//        System.out.println(numberSyllables("buf-fet"));
//        System.out.println(match("hello", "hELLo"));
//        System.out.println(hackerSpeak("javascript is cool"));
//        System.out.println(basketballPoints(5,2));
//        System.out.println(Arrays.toString(minMax(new double[]{251, 23, 6543, 12})));
//        JavaOutputFormatting.run();
//        JavaLoopsII.run();
//        JavaDatatypes.run();
        JavaEndOfFile.run();
    }

    //Algorithm 1
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }

    //Algorithm 2
    public static int addition(int num) {
        return ++num;
    }

    //Algorithm 3
    public static int search(int arr[], int item) {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]==item)
                return i;
        }
        return -1;
    }

    //Algorithm 4
    public static int convert(int minutes) {
        return minutes * 60;
    }

    //Algorithm 5
    public static String giveMeSomething(String a) {
        return "something " + a;
    }

    //Algorithm 6
    public static boolean reverse(boolean b) {
        return !b;
    }

    //Algorithm 7
    public static int countWords(String s) {

        return s.split(" ").length;
    }

    //Algorithm 8
    public static boolean existsHigher(int[] arr, int n) {
        if (arr.length == 0) return false;
        for (int i : arr) {
            if (i >= n) return true;
        }
        return false;
    }

    //Algorithm 9
    public static int getCount(String str) {

        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }

    //Algorithm 10
    public static int sum(int a, int b) {
        return a+b;
    }

    //Algorithm 11
    public static boolean isSameNum(int x, int y) {
        return x == y;
    }

    //Algorithm 12
    public static int calcAge(int age) {
        return age * 365;
    }

    //Algorithm 13
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    //Algorithm 14
    public static String reverse(final String str) {
        String reverseOrder = "";
        for (int i = str.length()-1; i >= 0; --i) {
            reverseOrder += str.charAt(i);
        }
        return reverseOrder;
    }

    //Algorithm 15
    public static boolean makesTen(int a, int b) {
        if (a + b == 10 || a ==10 || b == 10) {
            return true;
        } else {
            return false;
        }
    }

    //Algorithm 16
    public static int numberSyllables(String word) {
        return word.split("-").length;
    }

    //Algorithm 17
    public static boolean match(String str1, String str2) {
        return str1.toLowerCase().equals(str2.toLowerCase());
    }

    //Algorithm 18
    public static String hackerSpeak(String str) {
        return str.replaceAll("s", "5").replaceAll("o","0").replaceAll("e", "3").replaceAll("i", "1").replaceAll("a", "4");
    }

    //Algorithm 19
    public static int basketballPoints(int twos, int threes) {
        return ((twos * 2) + (threes * 3));
    }

    //Algorithm 20
    public static double[] minMax(double[] arr) {
        Arrays.sort(arr);
        return new double[] {arr[0], arr[arr.length-1]};
    }
}