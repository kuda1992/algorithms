package com.pluralsight.algo.dataStuctures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;

class QueueTest {


    private static Queue<Double> starBucksQueue;

    @BeforeEach
    public void beforeEachClassFunction() {
        starBucksQueue = new Queue<>();
    }

    @Test
    void shouldAddItemToQueue() {

        System.out.println("<<<<<<<<<<<<<<<Start>>>>>>>>>>>>>>>");
        int initialQueueSize = starBucksQueue.size();
        System.out.println("The current queue size is => " + starBucksQueue.size());

        starBucksQueue.enqueue(100.00);
        starBucksQueue.enqueue(50.00);

        int updatedQueueSize = starBucksQueue.size();

        System.out.println("After adding item to queue the size is => " + updatedQueueSize);

        assertTrue(updatedQueueSize > initialQueueSize);
        System.out.println("<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>");

    }

    @Test
    void shouldRemoveItemToQueue() {
        System.out.println("<<<<<<<<<<<<<<<Start>>>>>>>>>>>>>>>");
        System.out.println("The current queue size is => " + starBucksQueue.size());
        starBucksQueue.enqueue(100.00);
        starBucksQueue.enqueue(50.00);
        starBucksQueue.enqueue(25.00);
        starBucksQueue.enqueue(10.00);
        starBucksQueue.enqueue(5.00);
        System.out.println("After adding item to queue the size is => " + starBucksQueue.size());

        Double coffee = starBucksQueue.dequeue();
        System.out.println("After adding removing to queue the size is => " + starBucksQueue.size());
        System.out.println("The removed item is => " + coffee);

        assertTrue(coffee == 100.00);
        System.out.println("<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>");

    }

    @Test
    void shouldResizeTheQueue() {
    }

}