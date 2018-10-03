package com.pluralsight.algo.UnionFind;

import java.util.Arrays;

public class QuickUnion {

    private int[] id;
    private int count;

    public QuickUnion(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }


    public void union(int p, int q) {
        //give p and q the same root
        final int pRoot = find(p);
        final int qRoot = find(q);

        if(pRoot == qRoot) return;
        id[pRoot] = qRoot;
        count--;
    }


    public int find(int p) {

        //find the component name;
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int getCount() {
        return count;
    }

    public int[] getId() {
        return id;
    }

    @Override
    public String toString() {
        return Arrays.toString(getId());
    }
}
