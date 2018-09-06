package com.pluralsight.algo.sorting.elementary;

import org.jetbrains.annotations.NotNull;

public class SimpleSort {

    public boolean less(@NotNull Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public void exchange(@NotNull Comparable[] a, int i, int j) {
        Comparable temporary = a[i];
        a[i] = a[j];
        a[j] = temporary;
    }

    public void show(@NotNull Comparable[] a) {
        // print the array on a single line
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public boolean isSorted(@NotNull Comparable[] a) {

        //Test whether the array entries are in order
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }

        return true;
    }
}
