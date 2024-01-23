package dev.dsa.linkedlist.create;

import dev.dsa.linkedlist.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LengthOfLinkedListTest {

    private Node head;

    @BeforeEach
    public void setUp() throws Exception {
        head = CreateLinkedListRunner.createLinkedListOfSize();
    }

    @AfterEach
    public void tearDown() throws Exception {
        head = null;
    }

    @Test
    public void lengthOfLinkedList() {
        int len = LengthOfLinkedList.lengthOfLinkedList(head);
        TraverseLinkedList.traverseLinkedList(head);
        Assertions.assertEquals(8, len);
    }

    @Test
    public void lengthOfLinkedListWithNullHead() {
        int len = LengthOfLinkedList.lengthOfLinkedList(null);
        Assertions.assertEquals(0, len);
    }

    @Test
    public void lengthOfLinkedListWithOneSize() {
        Node head = CreateLinkedListRunner.createLinkedListOfSize(1);
        int lengthOfLinkedList = LengthOfLinkedList.lengthOfLinkedList(head);
        Assertions.assertEquals(1, lengthOfLinkedList);
    }
}