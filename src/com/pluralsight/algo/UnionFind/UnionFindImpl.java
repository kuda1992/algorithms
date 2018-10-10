package com.pluralsight.algo.UnionFind;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class UnionFindImpl implements UnionFind {

    private int[] id;
    private int count;

    public UnionFindImpl(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }

    }

    @Override
    public void union(int p, int q) throws NoSuchElementException {

        if(p > count) {
            throw new NoSuchElementException("Cannot merge an element which is not in the set");
        }
        int pID = find(p);
        int qID = find(q);

        // already connected
        if (pID == qID) return;

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) {
                System.out.println("Putting " + qID + " in " + id[i]);
                id[i] = qID;
            }
        }

        count--;
    }

    @Override
    public int find(int p) {
        return id[p];
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int count() {
        return count;
    }


    @Override
    public String toString() {
        return Arrays.toString(getId());
    }

    public int[] getId() {
        return id;
    }
}
