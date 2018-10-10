package com.pluralsight.algo.Percolation;

public interface Percolation {

    public void open(int x, int y);

    public boolean isOpen(Site site);

    public boolean isFull(Site site);

    public int numberOfOpenSites();

    public Position openRandomSite();

    public boolean percolates();

}
