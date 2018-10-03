package com.pluralsight.algo.sorting.priority;

import com.pluralsight.algo.utils.ReadFile;
import com.pluralsight.algo.utils.Transcation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UnorderedMaxPriorityQueueTest {

    URL path = UnorderedMaxPriorityQueueTest.class.getResource("tinyBatch.txt");
    ReadFile readFile;

    @BeforeEach
    void setUp() {


    }

    @Test
    void shouldAddElementsToTheUnorderedPriorityQueue() {

        UnorderedMaxPriorityQueue<Transcation> priorityQueue;

        priorityQueue = new UnorderedMaxPriorityQueue<>(5);
        readFile = new ReadFile(path.getPath());

        while (readFile.hasNextLine()) {
            final String line = readFile.nextLine();
            final Transcation transcation = new Transcation(line);
            priorityQueue.insert(transcation);
        }

        assertTrue(priorityQueue.size() > 5);
    }

    @Test
    void shouldHaveSevenHasItsMaximumNumber() {

        int[] numbers = {1,2,3,7,4,5};
        UnorderedMaxPriorityQueue<Integer> priorityQueue = new UnorderedMaxPriorityQueue<>(numbers.length);
        for(int i = 0; i < numbers.length; i++){
            priorityQueue.insert(numbers[i]);
        }
        assertTrue(priorityQueue.deleteMaximum() == 7);
    }
}