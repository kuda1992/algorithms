package com.pluralsight.algo.sorting.quick;

import org.junit.jupiter.api.Test;

class QuickSortTest {


    @Test
    void shouldSortElements() {

        Object[] numbers = {5, 1, 4, 6, 3, 2, 8, 7, 9};
        QuickSort.sort(numbers);
    }


    @Test
    void shouldShuffleTheArray() {

        Object[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //QuickSort.shuffle(numbers);
    }
}