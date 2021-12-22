package com.careerdevs;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFirstValue(new int[]{1, 2, 3, 4}));
        System.out.println(Main.addition(3));
        System.out.println(Main.search(new int[]{1, 2, 3, 4}, 3));
        System.out.println(convert(6));
        System.out.println(giveMeSomething("Michael"));
        System.out.println(reverse(false));
        System.out.println(countWords("Hello my name is Michael Guadagni."));
        System.out.println(existsHigher(new int[] {5, 3, 15, 22, 4}, 25));
        System.out.println(getCount("Celebration"));
    }
    //Algorithm 1
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }
    //ALgorithm 2
    public static int addition(int num) {
        return ++num;
    }
    //Algorithm 3
    public static int search(int array[], int item) {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]==item)
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
        if (b == false) {
            b = true;
        } else {
            b = false;
        }
        return b;
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
}