package com.pluralsight.algo.UnionFind;

import java.util.Arrays;

public class WeightedQuickUnion extends QuickUnion {

    private int[] size;

    public WeightedQuickUnion(int N) {
        super(N);
        size = new int[N];
        for (int i = 0; i < N; i++) {
            size[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);

        if (rootP == rootQ) return;

        // make smaller root point to larger one
        if (size[rootP] < size[rootQ]) {
            id[rootP] = rootQ;
            size[rootQ] += size[rootP];
        } else {
            id[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        count--;
    }

    @Override
    public int find(int p) {
        validate(p);
        while (p != id[p])
            p = id[p];
        return p;
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    private void validate(int p) {
        int n = id.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n - 1));
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(id);
    }
}
