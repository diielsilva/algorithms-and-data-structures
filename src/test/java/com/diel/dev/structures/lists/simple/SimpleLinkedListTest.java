package com.diel.dev.structures.lists.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleLinkedListTest {
    private SimpleLinkedList linkedList;

    @BeforeEach
    void setup() {
        linkedList = new SimpleLinkedList();
        linkedList.insert(10);
        linkedList.insert(15);
        linkedList.insert(20);
        linkedList.insert(25);
    }

    @Test
    void assertThatValuesWasCorrectlyInserted() {
        assertEquals(10, linkedList.getRoot().getValue());
        assertEquals(15, linkedList.getRoot().getNext().getValue());
        assertEquals(20, linkedList.getRoot().getNext().getNext().getValue());
        assertEquals(25, linkedList.getRoot().getNext().getNext().getNext().getValue());
        assertEquals(4, linkedList.size());
    }

    @Test
    void assertThatValuesWasCorrectlyRemoved() {
        Integer value = linkedList.remove(10);

        assertEquals(-1, value);
        assertEquals(4, linkedList.size());

        value = linkedList.remove(0);

        assertEquals(10, value);
        assertEquals(3, linkedList.size());
        assertEquals(15, linkedList.getRoot().getValue());

        value = linkedList.remove(1);

        assertEquals(20, value);
        assertEquals(2, linkedList.size());
        assertEquals(15, linkedList.getRoot().getValue());
        assertEquals(25, linkedList.getRoot().getNext().getValue());

        value = linkedList.remove(1);

        assertEquals(25, value);
        assertEquals(1, linkedList.size());
        assertEquals(15, linkedList.getRoot().getValue());

        value = linkedList.remove(0);

        assertEquals(15, value);
        assertTrue(linkedList.isEmpty());

    }
}
