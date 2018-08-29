package com.pluralsight.algo.linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static junit.framework.TestCase.assertEquals;

class LinkedListTest {

    private static LinkedList<String> linkedList;

    @BeforeEach
    public void beforeEachClassFunction() {

        linkedList = new LinkedList<>();

    }

    @Test
    void shouldAddItemsToTheHeadOfTheLinkedList() {
        System.out.println("<<<<<<<<<<<<<<<Start>>>>>>>>>>>>>>>");
        System.out.println("The size of the linked list is => " + linkedList.size());

        linkedList.addAtHead("aggay");

        assertEquals(linkedList.size(), 1);

        System.out.println("<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>");


    }

    @Test
    void shouldAddItemToTheTailOfTheLinkedList() {
        System.out.println("<<<<<<<<<<<<<<<Start>>>>>>>>>>>>>>>");

        System.out.println("The size of the linked list is => " + linkedList.size());

        Node<String> aggay = linkedList.addAtHead("aggay");

        System.out.println("The current head item in is => " + linkedList.first());

        assertEquals(linkedList.last(), "aggay");
        assertEquals(linkedList.first(), "aggay");

        Node<String> martina = linkedList.addAtTail("martina");

        System.out.println("The size of the linked list is => " + linkedList.size());

        assertEquals(linkedList.last(), "martina");

        Node<String> kuda = linkedList.addAtTail("kuda");

        assertEquals(linkedList.last(), "kuda");

        System.out.println("<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>");

    }

    @Test
    void shouldAddItemAddTheSpecifiedIndex() {
        System.out.println("<<<<<<<<<<<<<<<Start>>>>>>>>>>>>>>>");

        Node<String> aggay = linkedList.addAtHead("aggay");
        Node<String> martina = linkedList.addAtTail("martina");
        Node<String> ropa = linkedList.addAtTail("ropa");

        assertEquals(linkedList.last(), "ropa");

        System.out.println("The size of the linked list before adding item at specified item is => " + linkedList.size());

        linkedList.addAtIndex("kuda", 2);

        assertEquals(linkedList.last(), "ropa");

        System.out.println("The size of the linked list after adding item at specified item is => " + linkedList.size());

        assertEquals(linkedList.size(), 4);

        System.out.println("The last item of the linked list " + linkedList.last());


        System.out.println("<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>");

    }

    @Test
    void shouldDeleteItemAtTheSpecifiedIndex() {

        System.out.println("<<<<<<<<<<<<<<<Start>>>>>>>>>>>>>>>");

        Node<String> aggay = linkedList.addAtHead("aggay");
        Node<String> martina = linkedList.addAtTail("martina");
        Node<String> ropa = linkedList.addAtTail("ropa");

        System.out.println("The size of the linked list before deleting item at specified item is => " + linkedList.size());

        linkedList.deleteAtIndex(2);

        System.out.println("The size of the linked list after deleting item at specified item is => " + linkedList.size());

        assertEquals(linkedList.size(), 2);

        System.out.println("<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>");

    }

    @Test
    void shouldFindIndexOftheSpecifiedNode() {

        System.out.println("<<<<<<<<<<<<<<<Start>>>>>>>>>>>>>>>");

        Node<String> aggay = linkedList.addAtHead("aggay");
        Node<String> martina = linkedList.addAtTail("martina");
        Node<String> ropa = linkedList.addAtTail("ropa");


        assertEquals(linkedList.find("aggay"), 0);
        assertEquals(linkedList.find("martina"), 1);

        System.out.println("<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>");
    }

    @Test
    void shouldFindTheNodeValueAtGivenIndex() {

        System.out.println("<<<<<<<<<<<<<<<Start>>>>>>>>>>>>>>>");

        Node<String> aggay = linkedList.addAtHead("aggay");
        Node<String> martina = linkedList.addAtTail("martina");
        Node<String> ropa = linkedList.addAtTail("ropa");

        assertEquals(linkedList.find(0), "aggay");
        assertEquals(linkedList.find(1), "martina");

        System.out.println("<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>");
    }

    @Test
    void shouldPrintTheListContainedInTheLinkedList() {

        System.out.println("<<<<<<<<<<<<<<<Start>>>>>>>>>>>>>>>");

        Node<String> aggay = linkedList.addAtHead("aggay");
        Node<String> martina = linkedList.addAtTail("martina");
        Node<String> ropa = linkedList.addAtTail("ropa");

        assertEquals(true, true);

        linkedList.printList();

        System.out.println("<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>");
    }

    @Test
    void shouldDisplayTheSizeOfTheLinkedList() {

        assertEquals(linkedList.size(), 0);

    }


    @Test
    void shouldIterateThroughTheList() {

        System.out.println("<<<<<<<<<<<<<<<Start>>>>>>>>>>>>>>>");

        Node<String> aggay = linkedList.addAtHead("aggay");
        Node<String> martina = linkedList.addAtTail("martina");
        Node<String> kuda = linkedList.addAtTail("kuda");
        Node<String> ropa = linkedList.addAtTail("ropa");
        Node<String> tanya = linkedList.addAtTail("tanya");

        Iterator<String> iterator = linkedList.iterator();

        assertEquals(iterator.hasNext(), true);

        while (iterator.hasNext()) {
            System.out.println("The items in the linked list are " + iterator.next());
        }

        assertEquals(iterator.hasNext(), false);


        System.out.println("<<<<<<<<<<<<<<<End>>>>>>>>>>>>>>>");


    }
}