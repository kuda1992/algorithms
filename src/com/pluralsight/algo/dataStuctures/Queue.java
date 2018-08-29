package com.pluralsight.algo.dataStuctures;

import java.util.*;

public class Queue<T> {
    private T[] collection;
    private int total = 1;
    private int next = 0;
    private int first = 0;

    public Queue() {
        collection = (T[]) new Object[1];
    }


    private void resize(int capacity) {
        // create a temporary array with the new size
        T[] tmp = (T[]) new Object[capacity];
        boolean wasAPreviousNull = false;

        // go through the collection array and push all the previous items into the new array
        for (int i = 0; i < total; i++) {
            if (collection[i] != null) {
                if (wasAPreviousNull) {
                    tmp[i - 1] = collection[i];
                } else {
                    tmp[i] = collection[i];

                }
            } else {
                wasAPreviousNull = true;
            }
        }
        // reassign the collection array to the tmp array
        collection = tmp;
        // first becomes zero
        first = 0;
        total = capacity;
    }

    public Queue<T> enqueue(T item) {
        // resize the collection by 2 if the queue is full
        if (next >= total) {
            resize(collection.length + 1);
        }
        // push the item to the collection and increment next
        collection[next] = item;
        next++;
        return this;
    }

    public T dequeue() {

        if (total == 0) {
            throw new NoSuchElementException();
        }
        T item = collection[first];
        collection[first] = null;

        resize(total - 1);

        return item;
    }

    public T dequeue(int index) {
        if (total == 0) {
            throw new NoSuchElementException();
        }
        T item = collection[index];
        collection[index] = null;

        resize(total - 1);

        return item;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    public int size() {
        return total;
    }


    @Override
    public String toString() {
        return Arrays.toString(collection);
    }

}
