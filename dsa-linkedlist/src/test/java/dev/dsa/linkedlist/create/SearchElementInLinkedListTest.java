package dev.dsa.linkedlist.create;

import dev.dsa.linkedlist.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SearchElementInLinkedListTest {
    private Node head;

    @BeforeEach
    public void setUp() {
        head = CreateLinkedListRunner.createLinkedListOfSize();
    }

    @AfterEach
    public void tearDown() {
        head = null;
    }

    @ParameterizedTest
    @ValueSource(ints = {2,3,4,5})
    public void indexOfElement(int val) {
        int index = SearchElementInLinkedList.indexOfElement(head, val);
        Assertions.assertEquals(val-1, index);
    }

    @Test
    public void elementNotExists() {
        int index = SearchElementInLinkedList.indexOfElement(head, 101);
        Assertions.assertEquals(-1, index);
    }
}