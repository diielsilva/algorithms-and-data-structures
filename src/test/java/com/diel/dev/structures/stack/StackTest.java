package com.diel.dev.structures.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.diel.dev.structures.stack.Stack;
import com.diel.dev.structures.stack.StackNode;

public class StackTest {
    private Stack stack;

    @BeforeEach
    void setup() {
        stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
    }

    @Test
    void assertThatValuesWasCorrectlyAdded() {
        assertEquals(25, stack.getTop().getValue());
        assertEquals(20, stack.getPrevious().getValue());
    }

    @Test
    void assertThatValuesWasCorrectlyRemoved() {
        StackNode auxNode = stack.pop();

        assertEquals(25, auxNode.getValue());
        assertEquals(20, stack.getTop().getValue());

        auxNode = stack.pop();

        assertEquals(20, auxNode.getValue());
        assertEquals(15, stack.getTop().getValue());

        auxNode = stack.pop();

        assertEquals(15, auxNode.getValue());
        assertEquals(10, stack.getTop().getValue());

        auxNode = stack.pop();

        assertEquals(10, auxNode.getValue());
        assertEquals(5, stack.getTop().getValue());

        auxNode = stack.pop();

        assertEquals(5, auxNode.getValue());
        assertTrue(stack.isEmpty());

    }
}
