package com.pluralsight.algo.UnionFind;

public class UnionFind implements com.pluralsight.algo.interfaces.UnionFind {

    private int[] id;
    private int count;

    public UnionFind(int N) {
        count = N;
        id = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
        }

    }

    @Override
    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);

        // Nothing to do if p and q are already in the same component
        if (pID == qID) return;

        for(int i = 0; i < id.length; i++){
            if(id[i] == pID) {
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
}
