package com.pluralsight.algo.sorting.priority;

import java.util.NoSuchElementException;

public class MinPriorityQueue<Key extends Comparable<Key>> {
    private Key[] priorityQueue;
    private int N;
    private Comparable<Key> comparator;

    // create a priority queue
    MinPriorityQueue() {
        this(1);
    }

    // create a priority queue of initial capacity max
    MinPriorityQueue(int capacity) {
        priorityQueue = (Key[]) new Comparable[capacity];
        N = 0;
    }

    // create a priority queue of initial capacity max
    MinPriorityQueue(int capacity, Comparable<Key> comparator) {
        this.comparator = comparator;
        priorityQueue = (Key[]) new Comparable[capacity];
        N = 0;
    }

    // create a priority queue from keys in a[]
    MinPriorityQueue(Comparable<Key> comparator) {
        this(1, comparator);
    }

    MinPriorityQueue(Key[] keys) {
        N = keys.length;
        priorityQueue = (Key[]) new Comparable[N + 1];

        for (int i = 0; i < N; i++) {
            priorityQueue[i + 1] = keys[i];
        }
    }

    // insert a queue into the priority queue
    public void insert(Key item) {
        //resize double the length of the array if necessary
        if (N == priorityQueue.length - 1) resize(2 * priorityQueue.length);

        priorityQueue[++N] = item;
    }

    // return the largeest key
    public Key min() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        return priorityQueue[1];
    }

    // return and remove the largest key
    public Key deleteMin() {
        int min = 0;

        return priorityQueue[0];
    }

    private void resize(int capacity) {
        assert capacity > N;
        Key[] temp = (Key[]) new Object[capacity];

        for (int i = 0; i <= N; i++)
            temp[i] = priorityQueue[i];

        priorityQueue = temp;
    }

    private void swim(int k) {
        while (k > 1 && greater(k / 2, k)) {
            exchange(k, k / 2);
            k = k / 2;
        }
    }

    private void exchange(int i, int j) {
        Key temp = priorityQueue[i];
        priorityQueue[i] = priorityQueue[j];
        priorityQueue[j] = temp;
    }


    private boolean greater(int i, int j) {
        if (comparator == null) {
            return priorityQueue[i].compareTo(priorityQueue[j]) > 0;
        }
        return true; // comparator.compare(priorityQueue[i], priorityQueue[j]) > 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }
}
