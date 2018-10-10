package com.pluralsight.algo.UnionFind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightedQuickUnionTest {

    private WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(10);

    @Test
    void shouldHaveThreeSets() {
        weightedQuickUnion.union(0,1);
        weightedQuickUnion.union(3,4);
        weightedQuickUnion.union(4,5);
        weightedQuickUnion.union(4,3);
        weightedQuickUnion.union(6,7);
        weightedQuickUnion.union(8,9);
        weightedQuickUnion.union(7,8);
        System.out.println(weightedQuickUnion.toString());

        assertEquals(3, weightedQuickUnion.getCount());

    }
}