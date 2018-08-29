package com.pluralsight.algo;

public class Counter {
    private String id;
    Counter(String id) {
        this.id = id;
    }

    public void increment() {
    }

    public int tally() {
        return 1;
    }

    @Override
    public String toString() {
        return this.id;
    }
}
