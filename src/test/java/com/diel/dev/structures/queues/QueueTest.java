package com.diel.dev.structures.queues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueTest {
    private Queue queue;

    @BeforeEach
    void setup() {
        queue = new Queue();
        queue.push("Alex");
        queue.push("Bob");
        queue.push("Dean");
        queue.push("Charlie");
    }

    @Test
    void assertThatValuesWasCorrectlyInserted() {
        assertEquals("Alex", queue.getFirst().getName());
        assertEquals("Charlie", queue.getLast().getName());
    }

    @Test
    void assertThatValuesWasCorrectlyRemoved() {
        Person person = queue.pop();

        assertEquals("Alex", person.getName());
        assertEquals("Bob", queue.getFirst().getName());
        assertEquals("Charlie", queue.getLast().getName());

        person = queue.pop();

        assertEquals("Bob", person.getName());
        assertEquals("Dean", queue.getFirst().getName());
        assertEquals("Charlie", queue.getLast().getName());

        person = queue.pop();

        assertEquals("Dean", person.getName());
        assertEquals("Charlie", queue.getFirst().getName());
        assertEquals("Charlie", queue.getLast().getName());

        person = queue.pop();

        assertEquals("Charlie", person.getName());
        assertTrue(queue.isEmpty());

    }
}
