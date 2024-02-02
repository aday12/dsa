package com.algorithms;

public class LinkedListNode<V> {

    // TODO Lab 3.1.B: Modify to use generics, instead of int.

    private V value; //data member of the node
    private LinkedListNode<V> next; // self-referential pointer

    public LinkedListNode(V value, LinkedListNode<V> next) {
        this.value = value;
        this.next = next;
    }

    public LinkedListNode<V> getNext() {
        return next;
    }

    public LinkedListNode<V> setNext(LinkedListNode<V> next) {
        this.next = next;
        return this;
    }

    public V getValue() {
        return value;
    }

    public LinkedListNode<V> setValue(V value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "value=" + value +
                '}';
    }

}
