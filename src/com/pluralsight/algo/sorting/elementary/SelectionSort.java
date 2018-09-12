package com.pluralsight.algo.sorting.elementary;


import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * One of the simplest sorting alogrithms works as follows: First, find the smallest item in the array and exchange it with the first entry (itself if the first entry is already the smallest). Then find the next smallest item and exchange it with the second entry. Continue that way until all the elements of the array are sorted. It called selection sort because it works repeadely selecting the smallest remaining item
 */
public class SelectionSort {


    public static Comparable[] sort(Comparable a[]) {
        int length = a.length;
        int exchanges = 0;
        int count = 0;
        int notLessThanCurrent = 0;
        Comparable[] newArray = a;
        System.out.println("The length of the array is " + length);

        // go through the number of elements in the array
        for (int i = 0; i < length; i++) {

            //Set the current item to be the smallest/minimum
            int smallestNumber = i;
            count++;

            for (int j = i + 1; j < length; j++) {
                count++;
                System.out.println("comparing " + a[smallestNumber] + " and " + a[j]);

                // if the next number is smaller that the current number, reassign our reference to the index of the smallest number
                boolean isLess = less(a[j], a[smallestNumber]);
                if (isLess) {
                    exchanges++;
                    smallestNumber = j;
                } else {
                    notLessThanCurrent++;
                }
            }

            if (smallestNumber != i) {
                int currentNumber = (int) a[i];

                // if the number we're looking at is the smallest in size, swap it with the first element
                System.out.println("Swapping the number " + a[smallestNumber] + " for the number " + a[i]);


                newArray[i] = a[smallestNumber];
                newArray[smallestNumber] = currentNumber;
            }

            System.out.println("The array currently looks like: " + Arrays.toString(newArray));

        }
        System.out.println("The number of exchanges are " + exchanges);
        System.out.println("The number of times the loop ran " + count);
        System.out.println("The averages numbers of exchanges are " + (double) count / exchanges);
        System.out.println("The number of times which the value being compared is not less than the current value " + notLessThanCurrent);

        return newArray;
    }

    public static Comparable[] selectSort(Comparable a[]) {

        int[] numbers = {10, 7, 8, 6, 3};
        int length = numbers.length;

        for (int i = 0; i < length; i++) {
            int smallest = i;
            int j;
            for (j = i + 1; j < length; j++) {
                if (j < smallest)
                    smallest = j;
            }
            int tmp = numbers[i];
            numbers[i] = numbers[smallest];
            numbers[smallest] = tmp;
        }

        return a;
    }

    public static String sortString(String input) {

        // convert input string to char array
        char characters[] = input.toCharArray();

        System.out.println("Before the characters are sorted " + Arrays.toString(characters));

        Arrays.sort(characters);

        System.out.println("After the characters are sorted " + Arrays.toString(characters));

        return new String(characters);
    }

    public static boolean less(@NotNull Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static Comparable[] exchange(@NotNull Comparable[] a, int i, int j) {
        Comparable temporary = a[i];
        a[i] = a[j];
        a[j] = temporary;
        return a;
    }

    public static void show(@NotNull Comparable[] a) {
        // print the array on a single line
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static boolean isSorted(@NotNull Comparable[] a) {

        //Test whether the array entries are in order
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }

        return true;
    }
}
