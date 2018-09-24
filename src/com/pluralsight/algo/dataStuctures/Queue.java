package com.pluralsight.algo.dataStuctures;

import java.util.*;

public class Queue<T> implements Iterable<T> {
    private T[] collection;
    private int total;
    private int next;
    private int first;

    public Queue() {
        total = 1;
        next = 0;
        first = 0;
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
        return _dequeue(first);
    }


    private T _dequeue(int index) {
        if (total == 0) {
            throw new NoSuchElementException();
        }
        T item = collection[index];
        collection[index] = null;

        resize(total - 1);

        return item;
    }

    public T dequeue(int index) {
        return _dequeue(index);
    }

    public boolean isEmpty() {
        return total == 0;
    }

    public int size() {
        return total;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            private int current = first;

            @Override
            public boolean hasNext() {
                return current < total;
            }

            @Override
            public T next() {
                if (current >= total) {
                    throw new NoSuchElementException();
                }

                T tmp = collection[current];
                current++;
                return tmp;
            }
        };
        return iterator;
    }

}
