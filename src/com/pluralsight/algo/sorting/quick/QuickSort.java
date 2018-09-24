package com.pluralsight.algo.sorting.quick;


import java.util.Arrays;
import java.util.Random;

/**
 * Quick sort is pretty fast and efficient
 * Randomised quick sort always gives us the best efficiency
 * To sort an array we first select one of the elements in the list and call it pivot,
 * then rearrange the list so that all the elements less than the pivot are to the left of the array
 * and the elements of the right of the pivot are to the right of the pivot
 */
public class QuickSort {
    public static void sort(Object[] a) {
        a = QuickSort.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Object[] a, int start, int end) {
        System.out.println("Current proccesssd array " + Arrays.toString(a));
        System.out.println("start " + start);
        System.out.println("end " + end);
        if (end <= start) return;
        int j = partition(a, start, end);
        sort(a, start, j - 1);
        sort(a, j + 1, end);
    }

    private static Integer partition(Object[] a, Integer start, Integer end) {
        int i = start;
        int j = end + 1;

        while (true) {
            while (isLessThan(a[++i], a[start])) {
                System.out.println("currentItem " + i);
                if (i == end) break; //find item on the left and swap it
            }

            while (isLessThan(a[start], a[--j])) {
                if (j == start) break; // find the item on right to swap
            }

            if (i >= j) break;
            swap(a, i, j);
        }

        swap(a, start, j);
        return j;
    }

    public static boolean isLessThan(Object a, Object b) {
        return (int) a < (int) b;
    }

    public static Object[] shuffle(Object[] a) {
        int index;
        Object temp;
        final Random random = new Random();

        for (int i = a.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            if (index != i) {
                temp = a[index];
                a[index] = a[i];
                a[i] = temp;
            }
        }
        return a;
    }

    private static void swap(Object[] a, Integer leftIndex, Integer rightIndex) {
        Object temp = a[leftIndex];
        a[leftIndex] = a[rightIndex];
        a[rightIndex] = temp;
    }
}
