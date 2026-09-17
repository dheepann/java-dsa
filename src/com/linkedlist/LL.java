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
