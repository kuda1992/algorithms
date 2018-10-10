package com.pluralsight.algo.Percolation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PercolationImplTest {

    @Test
    void shouldDisplayTheItemsInTheGrid() {

        final PercolationImpl percolation = new PercolationImpl(5);

        System.out.println(percolation.toString());

        System.out.println("The number of open sites => " + percolation.numberOfOpenSites());


        System.out.println("Open random site => " + percolation.openRandomSite());

        System.out.println("The number of open sites => " + percolation.numberOfOpenSites());
    }


    @Test
    void shouldNotPercolate() {

        final PercolationImpl percolation = new PercolationImpl(3);
        percolation.open(0, 0);
        percolation.open(1, 2);
        percolation.open(0, 2);
        percolation.open(2, 1);
        System.out.println("Grid => " + percolation.toString());
        assertFalse(percolation.percolates());

    }

    @Test
    void shouldPercolate() {

        final PercolationImpl percolation = new PercolationImpl(3);
        percolation.open(0, 0);
        percolation.open(1, 2);
        percolation.open(0, 2);
        percolation.open(2, 1);
        percolation.open(1, 1);
        percolation.open(0, 1);
        percolation.open(1, 0);
        percolation.open(2, 2);
        percolation.open(2, 1);
        System.out.println("Grid => " + percolation.toString());
        System.out.println("The number of open sites => " + percolation.toString());
        assertTrue(percolation.percolates());

    }
}