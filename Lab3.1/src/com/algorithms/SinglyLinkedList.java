package com.algorithms;

public class SinglyLinkedList<V> {

    private LinkedListNode<V> head;
    SinglyLinkedList() {
        head = null;
    }

    public void addFront(V item) {
        // Implement with int.
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
        LinkedListNode<V> linkedListNode = new LinkedListNode<>(item, null);
        if (head == null) {
            head = linkedListNode;
        }
    }

    public void appendToList(V item) {
        // TODO Lab 3.1.A: Implement with int.
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
    }

    public void deleteFront() {
        // Implement with int.
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
        if (head == null){
            return;
        }
        head = head.getNext();
    }

    public void reverse() {
        // TODO Lab 3.1.A: Implement with int.
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
    }

    private void reverse(LinkedListNode<V> node) {
        // TODO Lab 3.1.A: Implement with int.
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
    }

    public void traverseList(boolean print) {
        int count = 0;
        LinkedListNode<V> curNode = head;
        while (curNode != null) {
            if (print) {
                System.out.println(curNode);
            }
            curNode = curNode.getNext();
            count++;
        }
    }

    public LinkedListNode<V> getHead() {
        return head;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        LinkedListNode<V> cur = head;
        while (cur != null) {
            builder.append(cur);
            builder.append("\n");
            LinkedListNode<V> next = cur.getNext();
            if (next != null) {
                cur = next;
            } else {
                cur = null;
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        SinglyLinkedList<Customer> singlyLinkedList = new SinglyLinkedList<>();

        singlyLinkedList.addFront(new Customer(4, "Aaron", 100.0f));
        singlyLinkedList.addFront(new Customer(3, "Joe", 200.0f));
        singlyLinkedList.addFront(new Customer(2, "Sang", 500.0f));
        singlyLinkedList.deleteFront();
        singlyLinkedList.appendToList(new Customer(5, "O'Shay", 300.0f));
        singlyLinkedList.traverseList(true);
    }
}
