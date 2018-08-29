package com.pluralsight.algo.linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

class NodeTest {

    private static Node<String> node;

    @BeforeEach
    public void beforeEachClassFunction() {

        node = new Node<>("bmw");

    }
    @Test
    void shouldGetNodeItem() {

        assertEquals("bmw", node.getItem());

    }

    @Test
    void shouldSetNodeItem() {

        node.setItem("audi");

        assertEquals("audi", node.getItem());

    }

    @Test
    void shouldGetNextNode() {

        assertEquals(null, node.getNext());

    }

    @Test
    void shouldSetNextNode() {

        Node<String> temp = node;

        node = new Node<>("mercedes");

        node.setNext(temp);

        assertEquals(node.getNext().getItem(), "bmw");
        assertTrue(temp.equals(node.getNext()));

    }
}