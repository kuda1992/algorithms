package com.pluralsight.algo.sorting.elementary;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(Comparable[] a) {
        int length = a.length;
        int exchanges = 0;
        int count = 0;
        int notLessThanCurrent = 0;

        System.out.println("The state of the unsorted array is " + Arrays.toString(a));

        for (int i = 0; i < length; i++) {
            final int currentUnsortedItem = (int) a[i];
            System.out.println("Current element of the array " + currentUnsortedItem);

            // iterate through sorted items
            // if the current unsorted item is smaller than item to its left
            // move the current item back one position in the array
            //
            int j;
            count++;
            for (j = i; (j > 0) && (currentUnsortedItem < (int) a[j - 1]); j--) {
                count++;
                System.out.println("Current unsorted " + currentUnsortedItem + " < " + a[j - 1] + " is " + (currentUnsortedItem <  (int) a[j - 1]));

                // shift the item left in the sorted subset of the array
                System.out.println("inserting " + a[j - 1] + " at index " + j);
                exchanges++;
                a[j] = a[j - 1];


            }

            notLessThanCurrent = length - exchanges;
            // shift the item to the right in the sorted subset of the array;
            a[j] = currentUnsortedItem;

            System.out.println("The state of the sorted array is " + Arrays.toString(a));
        }

        System.out.println("The number of exchanges are " + exchanges);
        System.out.println("The averages numbers of exchanges are " + (double) count/ exchanges);
        System.out.println("The number of times which the value being compared is not less than the current value " + notLessThanCurrent);

    }

}
