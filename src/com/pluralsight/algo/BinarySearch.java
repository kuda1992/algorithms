package com.pluralsight.algo;

import com.pluralsight.algo.algs4.In;

import java.net.URL;
import java.util.Arrays;

public class BinarySearch {


    public static void main(String[] args) {
        // write your code here
        URL path = BinarySearch.class.getResource(args[0]);

        System.out.println(path.getFile());

        int[] whitelist = In.readInts(path.getFile());

        Arrays.sort(whitelist);

        System.out.println(rank(23, whitelist));


    }


    public static int rank(int key, int[] array) {
        return rank(key, array, 0, array.length - 1);
    }

    public static int rank(int key, int[] array, int lower, int higher) {

        if (lower > higher)
            return -1;

        int mid = lower + (higher - lower) / 2;

        if (key < array[mid])
            return rank(key, array, lower, mid - 1);
        else if (key > array[mid])
            return rank(key, array, mid + 1, higher);

        return mid;
    }
}
