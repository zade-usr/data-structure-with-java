package dev.dsa.linkedlist.create;

import dev.dsa.linkedlist.Node;

import java.util.Objects;

public class TraverseLinkedList {
    public static void traverseLinkedList(Node head) {
        Node tmp = head; // not tempering head
        while (Objects.nonNull(tmp)) {
            System.out.print(tmp.data);
            tmp = tmp.next;
            if (Objects.nonNull(tmp)) {
                System.out.print("-->");
            }
        }
    }

    public static void traverseLinkedListWithRecursion(Node head) {
        if (Objects.isNull(head)) return;
        System.out.print(head.data);
        if (Objects.nonNull(head.next)){
            System.out.print("-->");
        }
        traverseLinkedListWithRecursion(head.next);
    }
}
