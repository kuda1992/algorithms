package com.pluralsight.algo.utils;

import java.util.ArrayList;
import java.util.List;
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

    public static List<Integer> randomListIntegers(int length, int lowerLimit, int upperLimit) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            final Random random = new Random();
            integers.add(random.nextInt(upperLimit) + lowerLimit);
        }
        return integers;
    }

    public static char randomCharacter() {
        String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ?/.,";
        Random rnd = new Random();
        return alphabet.charAt(rnd.nextInt(alphabet.length()));
    }

    public static char[] randomCharacters(int length) {
        char[] characters = new char[length];
        for(int i = 0; i < length; i++) {
            characters[i]= Helpers.randomCharacter();
        }
        return characters;
    }
}
