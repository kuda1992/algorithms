package com.pluralsight.algo.dataStuctures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Iterable<T> {
    private List<T> collection = new ArrayList();

    public void add(T item) {
        collection.add(item);
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
