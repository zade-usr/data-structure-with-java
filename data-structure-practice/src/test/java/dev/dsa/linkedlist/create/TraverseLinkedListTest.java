package dev.dsa.linkedlist.create;

import dev.dsa.linkedlist.Node;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TraverseLinkedListTest {

    private Node head;

    @Before
    public void setUp() {
        head = CreateLinkedListRunner.createLinkedList();
    }

    @After
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