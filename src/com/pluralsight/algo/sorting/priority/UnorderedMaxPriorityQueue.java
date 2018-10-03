package com.pluralsight.algo.sorting.priority;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class UnorderedMaxPriorityQueue<T extends Comparable<T>> implements Iterable<T> {

    private T[] priorityQueue;
    private int N;

    public UnorderedMaxPriorityQueue() {
        this(1);
    }


    public UnorderedMaxPriorityQueue(int capacity) {
        priorityQueue = (T[]) new Comparable[capacity];
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void insert(T item) {

        if (N > priorityQueue.length - 1) {
            resize(priorityQueue.length + 1);
        }

        priorityQueue[N++] = item;
    }


    private void resize(int capacity) {

        T[] temp = (T[]) new Comparable[capacity];

        for (int i = 0; i < N; i++) {
            temp[i] = priorityQueue[i];
        }
        priorityQueue = temp;
    }

    private void exchange(int i, int j) {
        T temp = priorityQueue[i];
        priorityQueue[i] = priorityQueue[j];
        priorityQueue[j] = temp;
    }

    public T deleteMaximum() {
        int max = 0;
        for (int i = 1; i < N; i++) {
            if (less(max, i)) max = i;
            exchange(max, N - 1);
        }
        return priorityQueue[--N];
    }

    public int size() {
        return N;
    }


    private boolean less(int i, int j) {
        return priorityQueue[i].compareTo(priorityQueue[j]) < 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(priorityQueue);
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            private int current = 0;

            @Override
            public boolean hasNext() {
                return current < N;
            }

            @Override
            public T next() {
                if (current >= N) {
                    throw new NoSuchElementException();
                }

                T tmp = priorityQueue[current];
                current++;
                return tmp;
            }
        };
        return iterator;
    }
}
