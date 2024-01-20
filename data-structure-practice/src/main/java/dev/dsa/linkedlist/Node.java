package dev.dsa.linkedlist;

public class Node {
    public int data;  // holds data
    public Node next; // holds reference

    // Constructor to create node with data, since reference is not known at creation so null ref
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
