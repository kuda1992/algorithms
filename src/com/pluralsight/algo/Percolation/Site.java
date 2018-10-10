package com.pluralsight.algo.Percolation;

public class Site {
    private int x;
    private int y;
    private boolean isOpen;

    public Site(int x, int y, boolean isOpen) {
        this.setX(x);
        this.setY(y);
        this.setOpen(isOpen);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "x: " + this.getX() + " , y: " + this.getY() + " , isOpen: " + this.isOpen();
    }

    public boolean compareTo(Site site) {
        if (this.getX() == site.getX() && this.getY() == site.getY()) {
            return true;
        }
        return false;
    }
}
