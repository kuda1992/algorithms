package com.pluralsight.algo.sorting.elementary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.Scanner;

class SimpleSortTest {

    SimpleSort simpleSort = new SimpleSort();
    private URL path;

    @BeforeEach
    public void beforeEachClassFunction() {

        path = SimpleSortTest.class.getResource("tiny.txt");

        String file = path.getFile();
        Scanner scanner = new Scanner(file);


        // String[] strings = {S, O, R, T, E, X ,A, M, P, L, E};

    }

    @Test
    void shouldSortTheElementsInTheArray() {
    }

    @Test
    void isSorted() {
    }
}