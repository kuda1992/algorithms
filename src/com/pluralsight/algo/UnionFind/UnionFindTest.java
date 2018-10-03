package com.pluralsight.algo.UnionFind;

import com.pluralsight.algo.utils.ReadFile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.Arrays;

class UnionFindTest {

    URL path = UnionFindTest.class.getResource("tinyUF.txt");
    ReadFile readFile;

    @BeforeEach
    public void beforeEachClassFunction() {

    }

    @Test
    void shouldReadTheUnionsInTinyUnionFinderFile() {

        path = UnionFindTest.class.getResource("tinyUF.txt");

        readFile = new ReadFile(path.getPath());

        int[] N = readFile.readAllIntegers();

        System.out.println(Arrays.toString(N));
        UnionFind unionFind = new UnionFind(N.length);

        for (int i = 0;  i + 1 < N.length; i++) {

            int p = N[i];
            int q = N[i + 1];

            System.out.println("p " + p);
            System.out.println("q " + q);

            if(unionFind.connected(p, q)) continue;

            unionFind.union(p, q);

        }

        System.out.println("Components count " + unionFind.count());
//
//        assertEquals(unionFind.count(), 3);
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