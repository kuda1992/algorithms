package com.pluralsight.algo.sorting.merge;

import java.util.Arrays;

public class MergeSort {

    private static int numberOfOperations;

    public static void sort(Object[] a) {
        final int length = a.length;

        if (length == 1) {
            return;
        }

        //if the array has more than one element split it into two parts left and right arrays
        final int midPoint = (int) Math.floor(length / 2);

        Object[] left = Arrays.copyOfRange(a, 0, midPoint);
        Object[] right = Arrays.copyOfRange(a, midPoint, length);

        sort(left);
        sort(right);

        merge(left, right, a);
    }


    private static void merge(Object[] left, Object[] right, Object[] a) {

        int index = 0;
        int leftLength = left.length;
        int rightLength = right.length;
        int combinedLength = leftLength + rightLength;

        while (leftLength > 0 && rightLength > 0 && index < combinedLength) {

            numberOfOperations++;
            if ((int) right[0] < (int) left[0]) {
                Shift shift = shift(right);
                a[index++] = shift.getRemovedItem();
                right = shift.getArray();
            } else {
                Shift shift = shift(left);
                a[index++] = shift.getRemovedItem();
                left = shift.getArray();
            }

            leftLength = left.length;
            rightLength = right.length;
        }

        while (leftLength > 0 && index < combinedLength) {
            numberOfOperations++;
            Shift shift = shift(left);
            a[index++] = shift.getRemovedItem();
            left = shift.getArray();
            leftLength = left.length;
        }

        while (rightLength > 0 && index < combinedLength) {
            Shift shift = shift(right);
            a[index++] = shift.getRemovedItem();
            right = shift.getArray();
            rightLength = right.length;
            numberOfOperations++;
        }

    }

    private static Shift shift(Object[] a) {
        Object itemRemoved = a[0];
        resize(a);
        final Shift shift = new Shift(resize(a), itemRemoved);
        return shift;
    }

    private static Object[] resize(Object[] array) {
        array = Arrays.copyOfRange(array, 1, array.length);
        return array;
    }

    public static int getNumberOfOperations() {
        return numberOfOperations;
    }


    private static class Shift {

        Shift(Object[] array, Object removedItem) {
            this.array = array;
            this.removedItem = removedItem;
        }

        private Object[] array;
        private Object removedItem;

        public Object[] getArray() {
            return array;
        }

        public void setArray(Object[] array) {
            this.array = array;
        }

        public Object getRemovedItem() {
            return removedItem;
        }

        public void setRemovedItem(Object removedItem) {
            this.removedItem = removedItem;
        }
    }

}
