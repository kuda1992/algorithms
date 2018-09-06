package com.pluralsight.algo.utils;

import java.util.Random;

public class Helpers {


    public static Comparable[] randomIntegers(int length, int lowerLimit, int upperLimit) {
        Comparable[] integers = new Comparable[length];
        for (int i = 0; i < length; i++) {
            final Random random = new Random();
            integers[i] = random.nextInt(upperLimit) + lowerLimit;
        }
        return integers;
    }
}