package com.pluralsight.algo.sorting.elementary;

import com.pluralsight.algo.utils.Helpers;
import com.pluralsight.algo.utils.StopWatch;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SelectionSortTest {

    SelectionSort selectionSort = new SelectionSort();

    @Test
    void shouldCompareNumbers() {


        assertEquals(SelectionSort.less(1, 2), true);
        assertEquals(SelectionSort.less(2, 2), false);

    }


    @Test
    void shouldExchangePositionsInArraysElements() {

        Comparable[] array = {23, 2, 52, 106, 73};

        Comparable[] exchange = SelectionSort.exchange(array, 1, 2);

        assertEquals(array[1], 52);

    }


    @Test
    void shouldSortTheElementsInTheArray() {

        Comparable[] array = {33, 2, 52, 106, 73};

        Comparable[] exchange = SelectionSort.sort(array);

        assertEquals(exchange[0], 2);
        assertEquals(exchange[1], 33);
        assertEquals(exchange[2], 52);
        assertEquals(exchange[3], 73);
        assertEquals(exchange[4], 106);

    }

    @Test
    void shouldTestWhetherArrayElemntsAreInOrder() {

        Comparable[] array = {33, 2, 52, 106, 73};
        final boolean isNotSorted = SelectionSort.isSorted(array);

        assertEquals(isNotSorted, false);


        Comparable[] exchange = SelectionSort.sort(array);


        final boolean isSorted = SelectionSort.isSorted(exchange);

        assertEquals(isSorted, true);
    }

    @Test
    void shouldSortRandomGeneratedNumber() {

        Comparable[] array = Helpers.randomIntegers(1000, 100, 20);
        Comparable[] array2 = Helpers.randomIntegers(1000, 100, 20);

        final StopWatch stopWatch = new StopWatch();
        SelectionSort.sort(array);
        final double elapsedTime = stopWatch.elapsedTime();


        final StopWatch insertionStopWatch = new StopWatch();
        InsertionSort.sort(array2);
        final double insertationElapsedTime = insertionStopWatch.elapsedTime();

        System.out.println("The selection sorting took '" + elapsedTime + "' seconds");
        System.out.println("The insertion sorting took '" + insertationElapsedTime + "' seconds");

    }

    @Test
    void shouldSortStringArray() {
        SelectionSort.sortString("EASYQUESTION");
    }


    @Test
    void shouldDisplayTheNumberOfExchangesInTheSelectionSort() {
        Comparable[] array = Helpers.randomIntegers(10, 0, 10);
        Comparable[] numbers = {3, 1, 0, 9, 2, 6, 1, 3, 5, 6};

        SelectionSort.sort(numbers);
    }
}