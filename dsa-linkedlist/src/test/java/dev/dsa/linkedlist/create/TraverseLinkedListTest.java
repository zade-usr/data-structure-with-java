package dev.dsa.linkedlist.create;

import dev.dsa.linkedlist.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TraverseLinkedListTest {

    private Node head;

    @BeforeEach
    public void setUp() {
        head = CreateLinkedListRunner.createLinkedListOfSize();
    }

    @AfterEach
    public void tearDown() {
        head = null;
    }

    @Test
    public void traverseLinkedList() {
        TraverseLinkedList.traverseLinkedList(head);
    }

    @Test
    public void traverseLinkedListWithRecursion() {
        TraverseLinkedList.traverseLinkedListWithRecursion(head);
    }
}