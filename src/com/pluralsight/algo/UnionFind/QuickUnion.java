package com.pluralsight.algo.UnionFind;

public interface QuickUnion {

    public void union(int p, int q);
    public int find(int p);
    public boolean connected(int p, int q);

}
