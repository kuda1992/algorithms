package com.pluralsight.algo.UnionFind;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickUnionImplTest {

    @Test
    void shouldUnionTheItemsInTheSet() {

        int[] N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        final QuickUnionImpl quickUnionImpl = new QuickUnionImpl(N.length);

        Assertions.assertEquals(10, quickUnionImpl.getId().length);

    }


    @Test
    void shouldFindElemntsInTheDataStructure() {

        int[] N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        final QuickUnionImpl quickUnionImpl = new QuickUnionImpl(N.length);

        Assertions.assertEquals(0, quickUnionImpl.getId()[0]);
        Assertions.assertEquals(5, quickUnionImpl.getId()[5]);
        Assertions.assertEquals(9, quickUnionImpl.getId()[9]);

        quickUnionImpl.union(5, 9);

        Assertions.assertEquals(9, quickUnionImpl.getId()[5]);

        quickUnionImpl.union(5, 8);

        Assertions.assertEquals(8, quickUnionImpl.getId()[8]);
        Assertions.assertEquals(9, quickUnionImpl.getId()[5]);

        quickUnionImpl.union(1, 2);
        quickUnionImpl.union(3, 4);
        quickUnionImpl.union(5, 6);


        Assertions.assertEquals(2, quickUnionImpl.getId()[1]);
        Assertions.assertEquals(2, quickUnionImpl.getId()[2]);
        Assertions.assertEquals(4, quickUnionImpl.getId()[3]);
        Assertions.assertEquals(4, quickUnionImpl.getId()[4]);
        Assertions.assertEquals(9, quickUnionImpl.getId()[5]);
        Assertions.assertEquals(6, quickUnionImpl.getId()[6]);
    }


    @Test
    void shouldCheckIfTwoElementsAreConnecteed() {

        int[] N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        final QuickUnionImpl quickUnionImpl = new QuickUnionImpl(N.length);


        quickUnionImpl.union(1, 2);
        quickUnionImpl.union(8, 9);
        quickUnionImpl.union(9, 8);
        quickUnionImpl.union(5, 6);
        quickUnionImpl.union(7, 8);
        quickUnionImpl.union(3, 4);
        quickUnionImpl.union(5, 8);

        Assertions.assertTrue(quickUnionImpl.connected(5, 9));

    }

}