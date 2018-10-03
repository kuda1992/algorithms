package com.pluralsight.algo.sorting.priority;

import com.pluralsight.algo.utils.ReadFile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URL;

class MinPriorityQueueTest {

    URL path = MinPriorityQueueTest.class.getResource("tinyBatch.txt");
    ReadFile readFile;
    MinPriorityQueue<String> priorityQueue;

    @BeforeEach
    void setUp() {

        priorityQueue = new MinPriorityQueue<>();
        readFile = new ReadFile(path.getPath());
    }

    @Test
    void insert() {
    }

    @Test
    void max() {
    }

    @Test
    void deleteMax() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void size() {
    }
}