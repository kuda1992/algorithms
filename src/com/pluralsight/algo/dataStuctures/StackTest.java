package com.pluralsight.algo.dataStuctures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

class StackTest {

    private static Stack<Double> stack;

    @BeforeEach
    public void beforeEachClassFunction() {
        stack = new Stack<>();
    }

    @Test
    void shoudAddItemsAtTheEndOfTheStack() {

        stack.push(100.00);
        stack.push(50.00);

        assertEquals(2, stack.size());

    }

    @Test
    void shouldRemoveItemsFromTheStack() {
        stack.push(100.00);
        stack.push(50.00);

        stack.pop();

        assertEquals(1, stack.size());

    }


    @Test
    void shouldHaveAStackWhichIsEmpty() {

        assertTrue(stack.isEmpty());

    }

    @Test
    void shouldHaveAStackWhichIsNotEmpty() {
        stack.push(100.00);
        assertTrue(!stack.isEmpty());
    }

    @Test
    void shouldHaveAStackWithNoSize() {
        assertEquals(0, stack.size());

    }
}