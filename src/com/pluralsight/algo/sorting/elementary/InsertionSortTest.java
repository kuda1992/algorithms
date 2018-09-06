package com.pluralsight.algo.sorting.elementary;

import com.pluralsight.algo.utils.Helpers;
import com.pluralsight.algo.utils.StopWatch;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class InsertionSortTest {

    private InsertionSort insertionSort;

    @Test
    void shouldSortTheElements() {
        final Comparable[] numbers = {28, 2, 10, 12, 3, 1, 7};
        InsertionSort.sort(numbers);


        assertEquals(numbers[0], 1);
        assertEquals(numbers[1], 2);
        assertEquals(numbers[2], 3);
        assertEquals(numbers[3], 7);
        assertEquals(numbers[4], 10);
        assertEquals(numbers[5], 12);
        assertEquals(numbers[6], 28);
    }

    @Test
    void shouldSortTheElementsFromRandomIntegers() {
        final Comparable[] numbers = Helpers.randomIntegers( 1000, 100, 1);

        final StopWatch stopWatch = new StopWatch();
        InsertionSort.sort(numbers);
        final double elapsedTime = stopWatch.elapsedTime();

        System.out.println("The sorting took '" + elapsedTime + "' seconds");

    }

    @Test
    void shouldDisplayTheNumberOfExchangesInTheSelectionSort() {
        Comparable[] array = Helpers.randomIntegers(10, 0, 10);

        InsertionSort.sort(array);
    }
}