package com.pluralsight.algo.UnionFind;

import com.pluralsight.algo.utils.ReadFile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class UnionFindImplTest {

    private URL path = UnionFindImplTest.class.getResource("tinyUF.txt");
    private ReadFile readFile;


    @BeforeEach
    public void beforeEachClassFunction() {

        readFile = new ReadFile(path.getPath());
    }

    @Test
    void shouldReadTheUnionsInTinyUnionFinderFile() {

        int[] N = readFile.readAllIntegers();
        UnionFindImpl unionFindImpl = new UnionFindImpl(N.length);

        for (int i = 0; i + 1 < N.length; i++) {

            int p = N[i];
            int q = N[i + 1];

            System.out.println("p " + p);
            System.out.println("q " + q);

            if (unionFindImpl.connected(p, q)) continue;

            unionFindImpl.union(p, q);

        }

        System.out.println("Components count " + unionFindImpl.count());
    }

    @Test
    void shouldFindAnElementInTheDataStructure() {

        UnionFindImpl unionFindImpl = new UnionFindImpl(10);

        assertEquals(0, unionFindImpl.getId()[0]);
        assertEquals(1, unionFindImpl.getId()[1]);
        assertEquals(2, unionFindImpl.getId()[2]);
        assertEquals(3, unionFindImpl.getId()[3]);
        assertEquals(4, unionFindImpl.getId()[4]);
        unionFindImpl.union(0, 3);
        assertEquals(3, unionFindImpl.getId()[0]);
    }

    @Test
    void shouldCheckIfItemsAreConnected() {

        UnionFindImpl unionFindImpl = new UnionFindImpl(10);
        final boolean zeroAndOneAreNotConnected = unionFindImpl.connected(0, 1);
        assertFalse(zeroAndOneAreNotConnected);
        unionFindImpl.union(0, 1);
        final boolean zeroAndOneAreConnected = unionFindImpl.connected(0, 1);
        assertTrue(zeroAndOneAreConnected);
        unionFindImpl.union(0, 2);
        unionFindImpl.union(0, 3);
        unionFindImpl.union(0, 4);
        final boolean zeroAndFourAreConnected = unionFindImpl.connected(0, 4);
        assertTrue(zeroAndFourAreConnected);
        System.out.println(unionFindImpl.toString());

    }

    @Test
    void shouldCountTheSetsInTheDataStructure() {

        UnionFindImpl unionFindImpl = new UnionFindImpl(10);
        assertEquals(10, unionFindImpl.count());
        unionFindImpl.union(0, 2);
        unionFindImpl.union(0, 3);
        unionFindImpl.union(0, 4);
        assertEquals(7, unionFindImpl.count());

        unionFindImpl.union(5, 8);
        unionFindImpl.union(6, 9);

        assertEquals(5, unionFindImpl.count());
        System.out.println(unionFindImpl.toString());
    }

}