package com.pluralsight.algo.linkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private int numNodes;

    LinkedList(T item) {
        head = new Node<>(item);
        numNodes++;
    }

    LinkedList() {
    }

    public Node<T> addAtHead(T item) {

        if (head != null) {
            Node<T> current = head;
            head = new Node<>(item);
            head.setNext(current);
        } else {
            head = new Node<>(item);
        }

        numNodes++;

        return head;
    }

    public Node<T> addAtTail(T item) {

        Node<T> tail;

        if (head != null) {
            tail = head;

            while (tail.getNext() != null) {
                tail = tail.getNext();
            }

            tail.setNext(new Node<>(item));
            numNodes++;
        } else {
            tail = new Node<>(item);
        }

        return tail;
    }

    public void addAtIndex(T item, int index) {
        Node<T> current = head;
        Node<T> holder;

        for (int i = 0; i < index - 1 && current.getNext() != null; i++) {
            current = current.getNext();
        }
        holder = current.getNext();
        current.setNext(new Node<>(item));
        current.getNext().setNext(holder);
        numNodes++;
    }

    public void deleteAtIndex(int index) {
        Node<T> current = head;

        for (int i = 0; i < index - 1 && current.getNext() != null; i++) {
            current = current.getNext();
        }

        current.setNext(current.getNext().getNext());
        numNodes--;
    }

    public int find(T nodeItem) {
        Node<T> current = head;
        int index = 0;

        while (!current.equals(nodeItem)) {
            index++;
            current = current.getNext();
        }

        return index;
    }

    public T find(int index) {

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getItem();
    }


    public T first() {
        return head.getItem();
    }

    public T last() {

        Node<T> last = head;

        while (last.getNext() != null) {
            last = last.getNext();
        }

        return last.getItem();
    }


    public void printList() {

        Node<T> current = head;

        while (current != null) {
            System.out.println("Item => " + current.getItem());
            current = current.getNext();
        }
    }

    public int size() {
        return numNodes;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (current == null) {
                    throw new NoSuchElementException();
                }

                T tmp = current.getItem();
                current = current.getNext();
                return tmp;
            }
        };
        return iterator;
    }
}
