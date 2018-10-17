package com.pluralsight.algo.Percolation;

import com.pluralsight.algo.UnionFind.WeightedQuickUnionImpl;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class PercolationImpl implements Percolation {

    private int size;
    private Site[][] grid;
    private WeightedQuickUnionImpl weightedQuickUnion;

    public PercolationImpl(int numberOfSites) {
        this.setSize(numberOfSites);
        grid = new Site[numberOfSites][numberOfSites];
        int value = 0;
        weightedQuickUnion = new WeightedQuickUnionImpl(numberOfSites * numberOfSites);
        for (int i = 0; i < numberOfSites; i++) {
            for (int j = 0; j < numberOfSites; j++) {
                grid[i][j] = new Site(i, j, false, value);
                value++;
            }
        }
    }

    @Override
    public void open(int x, int y) {
        Position position = findPosition(x, y);
        final Site site = grid[position.getX()][position.getY()];
        site.setOpen(true);
        grid[position.getX()][position.getY()] = site;
        System.out.println("Opening x: " + site.getX() + ", y: " + site.getY());

        if (isLeftSiteOpen(site)) {
            System.out.println("joining the site with the left site");
            weightedQuickUnion.union(site.getValue(), getSiteValue(site.getX(), site.getX() - 1));
        }
        if (isRighSiteOpen(site)) {
            System.out.println("joining the site with the right site");
            weightedQuickUnion.union(site.getValue(), getSiteValue(site.getX(), site.getX() + 1));
        }

        if (isTopSiteOpen(site)) {
            System.out.println("joining the site with the top site");
            weightedQuickUnion.union(site.getValue(), getSiteValue(site.getY(), site.getY() - 1));
        }

        if (isBottomSiteOpen(site)) {
            System.out.println("joining the site with the bottom site");
            weightedQuickUnion.union(site.getValue(), getSiteValue(site.getY(), site.getY() + 1));
        }
    }

    private int getSiteValue(int x, int y) {
        Position position = findPosition(x, y);
        final Site site = grid[position.getX()][position.getY()];
        return site.getValue();
    }

    private Position findPosition(int x, int y) throws NoSuchElementException {
        for (int i = 0; i < this.getSize(); i++) {
            for (int j = 0; j < this.getSize(); j++) {
                final Site siteInGrid = grid[i][j];
                if (siteInGrid.getX() == x && siteInGrid.getY() == y) {
                    return new Position(i, j);
                }
            }
        }

        throw new NoSuchElementException();
    }

    private boolean isLeftSiteOpen(Site site) {
        Site leftSite = new Site(site.getX(), site.getY(), site.isOpen(), site.getValue());
        if (site.getX() > 0) {
            leftSite.setX(site.getX() - 1);
            Position position = findPosition(leftSite.getX(), leftSite.getY());
            return grid[position.getX()][position.getY()].isOpen();
        }
        return false;
    }

    private boolean isRighSiteOpen(Site site) {
        Site rightSite = new Site(site.getX(), site.getY(), site.isOpen(), site.getValue());
        if (site.getX() < this.getSize() - 1) {
            rightSite.setX(site.getX() + 1);
            Position position = findPosition(rightSite.getX(), rightSite.getY());
            return grid[position.getX()][position.getY()].isOpen();
        }
        return false;
    }

    private boolean isTopSiteOpen(Site site) {
        Site topSite = new Site(site.getX(), site.getY(), site.isOpen(), site.getValue());
        if (site.getY() > 0) {
            topSite.setY(site.getY() - 1);
            Position position = findPosition(topSite.getX(), topSite.getY());
            return grid[position.getX()][position.getY()].isOpen();
        }
        return false;
    }


    private boolean isBottomSiteOpen(Site site) {
        Site bottomSite = new Site(site.getX(), site.getY(), site.isOpen(), site.getValue());
        if (site.getY() < this.getSize() - 1) {
            bottomSite.setY(site.getY() + 1);
            Position position = findPosition(bottomSite.getX(), bottomSite.getY());
            return grid[position.getX()][position.getY()].isOpen();
        }
        return false;
    }

    public int generateRandom(int upperLimit) {
        final Random random;
        random = new Random();
        return random.nextInt(upperLimit);
    }

    @Override
    public boolean isOpen(Site site) {
        return site.isOpen();
    }

    @Override
    public boolean isFull(Site site) {
        return false;
    }

    @Override
    public int numberOfOpenSites() {
        int count = 0;
        for (int i = 0; i < this.getSize(); i++) {
            for (int j = 0; j < this.getSize(); j++) {
                final Site site = grid[i][j];
                if (site.isOpen()) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public Position openRandomSite() {
        int positionX = generateRandom(this.getSize());
        int positionY = generateRandom(this.getSize());
        Position position = new Position(positionX, positionY);

        for (int i = 0; i < this.getSize(); i++) {
            for (int j = 0; j < this.getSize(); j++) {
                final Site site = grid[i][j];
                if (!site.isOpen() && site.getY() == position.getY() && site.getX() == position.getX()) {
                    site.setOpen(true);
                }
            }
        }
        return position;
    }

    @Override
    public boolean percolates() {
        for (int i = 0; i < this.getSize(); i++) {
            for (int j = (this.getSize() * this.getSize() - this.getSize()); j < this.getSize() * this.getSize(); j++) {
                if (weightedQuickUnion.connected(i, j)) return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(grid);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
