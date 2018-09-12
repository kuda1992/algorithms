package com.pluralsight.algo.sorting.merge;

import com.pluralsight.algo.utils.Helpers;
import com.pluralsight.algo.utils.StopWatch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

class MergeSortTest {
    Comparable[] list = Helpers.randomIntegers(10, 1, 20);

    @BeforeEach
    public void beforeEachClassFunction() {

    }

    @Test
    void shouldSortTheElementsInTheList() {


        Object[] list2 =  {9, 15, 12, 1, 2, 16, 11, 13, 1, 12};
        System.out.println("The start list " + Arrays.toString(list2));

        final StopWatch stopWatch = new StopWatch();
        MergeSort.sort(list2);
        final double elapsedTime = stopWatch.elapsedTime();

        assertEquals(list2[0], 1);
        assertEquals(list2[9], 16);

        System.out.println("The final list " + Arrays.toString(list2));

        System.out.println("The sorting took '" + elapsedTime + "' seconds");
        System.out.println("The number of merges which occured " + MergeSort.getNumberOfOperations());


    }


    @Test
    void shouldDisplayHowLongItTakesToDoEachOperaton() {


        Object[] list2 =  {9, 15, 12, 1, 2, 16, 11, 13, 1, 12};
        MergeSort.sort(list2);

        System.out.println("The number of merges which occured " + MergeSort.getNumberOfOperations());

    }
}