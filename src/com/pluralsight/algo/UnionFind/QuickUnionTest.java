package com.pluralsight.algo.UnionFind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickUnionTest {

    @Test
    void shouldUnionTheItemsInTheSet() {

        int[] N = {0,1,2,3,4,5,6,7,8,9};

        final QuickUnion quickUnion = new QuickUnion(N.length);

        quickUnion.union(4,3);
        assertEquals(quickUnion.getId()[4], 3);
        System.out.println(quickUnion.toString());
        quickUnion.union(3,8);
        assertEquals(quickUnion.getId()[3], 8);
        System.out.println(quickUnion.toString());
        quickUnion.union(6,5);
        assertEquals(quickUnion.getId()[6], 5);
        System.out.println(quickUnion.toString());
        quickUnion.union(9,4);
        assertEquals(quickUnion.getId()[9], 8);
        System.out.println(quickUnion.toString());
        quickUnion.union(2,1);
        assertEquals(quickUnion.getId()[2], 1);
        System.out.println(quickUnion.toString());
        assertTrue(quickUnion.connected(8,9));
        quickUnion.union(5,0);
        assertEquals(quickUnion.getId()[5], 0);
        System.out.println(quickUnion.toString());
        quickUnion.union(7,2);
        assertEquals(quickUnion.getId()[7], 1);
        System.out.println(quickUnion.toString());
        quickUnion.union(6,1);
        assertEquals(quickUnion.getId()[6], 5);
        System.out.println(quickUnion.toString());
        quickUnion.union(7,3);
        assertEquals(quickUnion.getId()[7], 1);
        System.out.println(quickUnion.toString());

    }

}