package com.pluralsight.algo.UnionFind;

import com.pluralsight.algo.algs4.In;
import com.pluralsight.algo.algs4.StdIn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

class UnionFindTest {

    private URL path;

    @BeforeEach
    public void beforeEachClassFunction() {

    }

    @Test
    void shouldReadTheUnionsInTinyUnionFinderFile() {

        path = UnionFindTest.class.getResource("tinyUF.txt");

        String file = path.getFile();

        int[] N = In.readInts(file);
        UnionFind unionFind = new UnionFind(N.length);

        while (!StdIn.isEmpty()) {

            int p = StdIn.readInt();
            int q = StdIn.readInt();

            if (unionFind.connected(p, q)) continue; // ignore if connected

            unionFind.union(p, q); // combine components

            System.out.println(p + " " + q);

        }

        System.out.println(unionFind.count() + " components");

        assertEquals(unionFind.count(), 3);
    }

    @Test
    void find() {
    }

    @Test
    void connected() {
    }

    @Test
    void count() {
    }
}