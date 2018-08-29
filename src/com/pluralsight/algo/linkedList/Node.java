package com.pluralsight.algo.linkedList;

public class Node<T> {
    private T item;
    private Node<T> next;

    Node() {
        this.item = null;
        this.next = null;
    }

    Node(T item) {
        this.item = item;
        this.next = null;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object item) {
        return item.toString() == this.getItem();
    }
}
