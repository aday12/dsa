package com.algorithms;

import java.util.Optional;

public class Queue<V> {

    // DblLinkedListNode is provided
    // create a private Node for "head"
    // create a private Node for "tail"
    private DblLinkedListNode<V> head;
    private DblLinkedListNode<V> tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("one");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("one");
        q.enqueue("two");
        q.enqueue("three");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("two");
        q.enqueue("three");
        System.out.println("2 values added to queue");
        System.out.println("Now try to remove both values");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("\nAll values removed, try to remove another");
        System.out.println(q.dequeue());
        System.out.println("\nQueue should be empty now, add a new item");
        q.enqueue("four");
        System.out.println("\nNow remove the one item");
        System.out.println(q.dequeue());
        System.out.println("\nAll items should be gone, try to remove one");
        System.out.println(q.dequeue());

    }

    public void enqueue(V item) {
        DblLinkedListNode<V> newNode = new DblLinkedListNode<>(item, null, null);
        // TODO Lab 3.2.a: Create pseudocode for operation.
        // TODO Lab 3.2.b: Implement based on pseudocode.
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }

        tail.setNext(newNode);
        newNode.setPrevious(tail);
        tail = newNode;
    }

    public Optional<V> dequeue() {
        Optional<DblLinkedListNode<V>> node = Optional.ofNullable(head);
        head = node.flatMap(DblLinkedListNode::getNext).orElse(null);
        Optional.ofNullable(head).ifPresent(n -> n.setPrevious(null));
        if (head == null) tail = null;
        return node.map(DblLinkedListNode::getValue);
    }

}
