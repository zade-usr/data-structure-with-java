package dev.dsa.linkedlist.create;

import dev.dsa.linkedlist.Node;

import java.util.Objects;

public class LengthOfLinkedList {

    public static int lengthOfLinkedList(Node head) {
        int len = 0;
        Node tmp = head;
        if (Objects.isNull(tmp)) return len;
        while (Objects.nonNull(tmp)) {
            len++;
            tmp = tmp.next;
        }
        return len;
    }
}
