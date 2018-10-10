package com.pluralsight.algo.UnionFind;

public interface UnionFind {


    /**
     * Add connection between p and q
     * @param p
     * @param q
     */
    void union(int p, int q);

    /**
     * Component identifier for p (0 to N-1)
     * @param p
     * @return int
     */
    int find(int p);

    /**
     * Return true if p and q are in the same component
     * @param p
     * @param q
     * @return boolean
     */
    boolean connected (int p, int q);

    /**
     * Number of compoments
     * @return int
     */
    int count();

}
