package com.pluralsight.algo.sorting.quick;


/**
 * Quick sort is pretty fast and efficient
 * Randomised quick sort always gives us the best efficiency
 * To sort an array we first select one of the elements in the list and call it pivot,
 * then rearrange the list so that all the elements less than the pivot are to the left of the array
 * and the elements of the right of the pivot are to the right of the pivot
 */
public class QuickSort {
    public static void sort(Object[] a) {
        final int length = a.length;

        if (length == 1) {
            return;
        }
        final Integer start = 0;
        final Integer end = a.length - 1;
        final Integer partitionIndex = partition(a, start, end);



    }

    private static Integer partition(Object[] a, Integer startIndex, Integer endIndex) {

        final Integer pivot = (int) a[endIndex];
        Integer partitionIndex = startIndex;

        for (int i = startIndex; i <= a.length; i++) {
            final Integer currentItem = (int) a[i];
            if (currentItem <= pivot) {
                swap(a, i, partitionIndex);
                partitionIndex++;
            }
        }

        swap(a, partitionIndex, endIndex);
        return partitionIndex;
    }

    private static void swap(Object[] a, Integer leftIndex, Integer rightIndex) {
        Object temp = a[leftIndex];
        a[leftIndex] = a[rightIndex];
        a[rightIndex] = temp;
    }
}
