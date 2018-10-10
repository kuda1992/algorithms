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
        percolation.open(new Site(0, 0, true));
        percolation.open(new Site(1, 2, true));
        percolation.open(new Site(0, 2, true));
        percolation.open(new Site(2, 1, true));
        System.out.println("Grid => " + percolation.toString());
        assertFalse(percolation.percolates());

    }

    @Test
    void shouldPercolate() {

        final PercolationImpl percolation = new PercolationImpl(3);
        percolation.open(new Site(0, 0, true));
        percolation.open(new Site(1, 2, true));
        percolation.open(new Site(0, 2, true));
        percolation.open(new Site(2, 1, true));
        percolation.open(new Site(1, 1, true));
        percolation.open(new Site(0, 1, true));
        percolation.open(new Site(1, 0, true));
        percolation.open(new Site(2, 2, true));
        System.out.println("Grid => " + percolation.toString());
        System.out.println("The number of open sites => " + percolation.toString());
        assertTrue(percolation.percolates());

    }
}