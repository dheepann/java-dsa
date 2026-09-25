package com.linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(56);
        list.insertAtFirst(6);
        list.insertAtFirst(8);
        list.insertAtFirst(17);
        list.insertInBetween(34, 4);
        list.display();
    }
}
