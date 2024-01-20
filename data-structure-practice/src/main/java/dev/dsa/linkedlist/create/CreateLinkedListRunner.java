package dev.dsa.linkedlist.create;

import dev.dsa.linkedlist.Node;

import java.util.Objects;

public class CreateLinkedListRunner {
    public static Node createLinkedList() {
        Node head = null;
        Node mover = null; // always point to last node as to when new node will be inserted it will help.
        for (int i = 1; i < 8; i++) {
            Node node = new Node(i);
            if (Objects.isNull(head)) { // at first head will be null.
                head = node;
                mover = head;
            } else {
                mover.next = node;
                mover = node;
            }
        }
        return head;
    }
}
