package com.pluralsight.algo;

public class Cat {

    public static void main(String[] args) {
        // write your code here

        String kuda = mystery("kuda");

        System.out.println(kuda);

    }

    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }
}
