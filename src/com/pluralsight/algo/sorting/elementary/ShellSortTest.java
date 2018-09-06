package com.pluralsight.algo.sorting.elementary;

import com.pluralsight.algo.utils.Helpers;
import com.pluralsight.algo.utils.StopWatch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {

    @Test
    void shouldSortTheElements() {


        final Comparable[] numbers = Helpers.randomIntegers( 1000, 1, 999);

        final StopWatch stopWatch = new StopWatch();
        ShellSort.sort(numbers);
        final double elapsedTime = stopWatch.elapsedTime();

        System.out.println("The sorting took '" + elapsedTime + "' seconds");

    }
}