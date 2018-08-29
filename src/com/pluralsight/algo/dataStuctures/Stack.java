package com.pluralsight.algo.dataStuctures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack<T> implements Iterable<T> {
    private List<T> collection = new ArrayList<>();

    public void push(T item) {
        collection.add(item);
    }

    public T pop() {
        return collection.remove(this.size() - 1);
    }

    public T pop(int index) {
        return collection.remove(index);
    }

    public boolean isEmpty() {
        return collection.isEmpty();
    }

    public int size() {
        return collection.size();
    }

    @Override
    public Iterator<T> iterator() {
        return collection.iterator();
    }
}
