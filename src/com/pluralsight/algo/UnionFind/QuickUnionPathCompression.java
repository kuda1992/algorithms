package com.pluralsight.algo.UnionFind;

public class QuickUnionPathCompression extends  QuickUnion{
    private int[] size;

    public QuickUnionPathCompression (int N) {
        super(N);
        size = new int[N];
        for (int i = 0; i < N; i++) {
            size[i] = 1;
        }

    }


}
