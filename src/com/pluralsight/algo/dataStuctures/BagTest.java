package com.pluralsight.algo.dataStuctures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static junit.framework.TestCase.assertTrue;

class BagTest {

    private static Bag<Double> bag;

    @BeforeEach
    public void beforeEachClassFunction() {
        bag = new Bag<>();
        bag.add(100.00);
        bag.add(99.00);
        bag.add(101.00);
        bag.add(120.00);
        bag.add(98.00);
        bag.add(107.00);
        bag.add(109.00);
        bag.add(81.00);
        bag.add(101.00);
        bag.add(90.00);
    }

    @Test
    void shouldAddItemsToBag() {
        int currentBagSize = bag.size();
        bag.add(122.99);
        assertTrue(bag.size() > currentBagSize);

    }

    @Test
    void shouldCheckIsBagIsEmpty() {
        bag = new Bag<>();
        assertTrue(bag.isEmpty());
    }

    @Test
    void shouldCheckTheSizeOfTheBag() {
        assertTrue(bag.size() > 1);
    }

    @Test
    void shouldIterateThroughAllItemsInTheBag() {

        Iterator<Double> iterator = bag.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        assertTrue(true);
    }

    @Test
    void shouldFindTheMeanOfAllDoubles() {

        Iterator<Double> iterator = bag.iterator();
        double sum = 0.0;
        double average;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("The sum is => " + sum);

        average = sum / bag.size();

        System.out.println("The average items in bag => " + average);

        assertTrue(true);
    }
}