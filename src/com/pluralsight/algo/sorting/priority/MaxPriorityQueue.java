package com.pluralsight.algo.sorting.priority;

public class MaxPriorityQueue<Key extends Comparable<Key>> {

    private Key[] priorityQueue;
    private int N;

    // create a priority queue
    MaxPriorityQueue() {
        priorityQueue = (Key[]) new Comparable[1];
        N = 1;
    }

    // create a priority queue of initial capacity max
    MaxPriorityQueue(int max) {
        priorityQueue = (Key[]) new Comparable[max];
        N = 0;
    }

    // create a priority queue from keys in a[]
    MaxPriorityQueue(Key[] a) {

    }

    // insert a queue into the priority queue
    public void insert(Key item) {
        priorityQueue[N++] = item;
    }

    // return the largest key
    public Key max() {
        return null;
    }

    // return and remove the largest key
    public Key deleteMax() {
        int max = 0;

        for (int i = 1; i < N; i++) {
            if (less(max, i)) max = i;
        }

        return priorityQueue[--N];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    private boolean less(int a, int b) {
        return a < b;
    }

    private void swap() {

    }

    public int size() {
        return N;
    }
}
