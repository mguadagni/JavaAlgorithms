package com.careerdevs;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFirstValue(new int[]{1, 2, 3, 4}));
        System.out.println(Main.addition(3));
        System.out.println(Main.search(new int[]{1, 2, 3, 4}, 3));
        System.out.println(convert(6));
        System.out.println(giveMeSomething("Michael"));
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
}