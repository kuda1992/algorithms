package com.pluralsight.algo.UnionFind;

public class WeightedQuickUnionImpl extends QuickUnionImpl {

    private int[] size;

    public WeightedQuickUnionImpl(int N) {
        super(N);
        size = new int[N];
        for (int i = 0; i < N; i++) {
            size[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
        System.out.println("Connecting p: " + p + ", q: " + q);
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
}
