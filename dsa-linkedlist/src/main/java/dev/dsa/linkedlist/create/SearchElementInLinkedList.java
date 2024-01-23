package dev.dsa.linkedlist.create;

import dev.dsa.linkedlist.Node;

import java.util.Objects;

public class SearchElementInLinkedList {

    public static int indexOfElement(Node head, int val) {
        Node tmp = head; // don't mess with head reference.
        int index = -1;
        while (Objects.nonNull(tmp)) {
            index++;
            if (tmp.data == val) {
                return index; // return if match
            }
            tmp = tmp.next;  // check next node
        }
        return -1;
    }
}
