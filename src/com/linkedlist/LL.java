package com.linkedlist;

public class LL {
    private Node head;
    private Node tail;
    // these head and tail are pointers which points to the Node
    // now it is not pointing to anything but null
    private int size;

    public LL() {
        this.size = 0;
    }

    // now we will insert the element at first position
    public void insertAtFirst(int val) {
        Node node = new Node(val); // create a node
        node.next = head; // meaning val.next will point to the head pointer which might be pointing to anything or to null
        head = node; // now point the head to the newly established node.

        // if the element is the first element being added, point the tail to the node also
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertInBetween(int val, int index) {
        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        if (index == size) {
            insertAtLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next); // Put val in the new Node, and connect that new Node to whatever comes after temp. but both the newly created Node and the original Node point to the same Node that comes after it
        temp.next = node; // Now make temp point to this new Node. in other words, take the next field inside the value pointing by temp Node and put the reference stored in node into it.
    }

    public void insertAtLast(int val) {
        if (tail == null) {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int val;
        private Node next; // next is nothing but a pointer / ref variable that is going to point the object that I provided.

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
