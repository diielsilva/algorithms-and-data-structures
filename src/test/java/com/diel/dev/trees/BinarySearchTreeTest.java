package com.diel.dev.trees;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
    private BinarySearchTree tree;

    @BeforeEach
    void setup() {
        tree = new BinarySearchTree();
    }

    @Test
    void assertThatValuesWasAddedCorrectly() {
        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(4);
        tree.insert(15);
        tree.insert(12);
        tree.insert(16);

        assertEquals(10, tree.getValue());
        assertEquals(5, tree.getLeft().getValue());
        assertEquals(7, tree.getLeft().getRight().getValue());
        assertEquals(4, tree.getLeft().getLeft().getValue());
        assertEquals(15, tree.getRight().getValue());
        assertEquals(16, tree.getRight().getRight().getValue());
        assertEquals(12, tree.getRight().getLeft().getValue());

    }

    @Test
    void assertThatValuesWasCorrectlySearched() {
        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(4);
        tree.insert(15);
        tree.insert(12);
        tree.insert(16);

        int foundResult = tree.search(4);
        int notFoundResult = tree.search(-50);

        assertEquals(4, foundResult);
        assertEquals(-1, notFoundResult);
    }

    @Test
    void assertThatTreeWasSuccesfullyDisplayedInPreOrder() {
        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(4);
        tree.insert(15);
        tree.insert(12);
        tree.insert(16);

        assertDoesNotThrow(() -> tree.preOrder());

    }

    @Test
    void assertThatTreeWasSuccesfullyDisplayedInOrder() {
        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(4);
        tree.insert(15);
        tree.insert(12);
        tree.insert(16);

        assertDoesNotThrow(() -> tree.inOrder());

    }

    @Test
    void assertThatTreeWasSuccesfullyDisplayedInPostOrder() {
        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(4);
        tree.insert(15);
        tree.insert(12);
        tree.insert(16);

        assertDoesNotThrow(() -> tree.postOrder());

    }

    @Test
    void assertThatTreeWasSuccesfullyDisplayedInReverseOrder() {
        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(4);
        tree.insert(15);
        tree.insert(12);
        tree.insert(16);

        assertDoesNotThrow(() -> tree.inReverseOrder());

    }

    @Test
    void assertThatTreeWasRemovingValueWithoutErrors() {
        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(4);
        tree.insert(15);
        tree.insert(12);
        tree.insert(16);

        tree = tree.remove(10);

        assertDoesNotThrow(() -> tree.inOrder());
    }
}
