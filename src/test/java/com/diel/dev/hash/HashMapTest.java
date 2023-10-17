package com.diel.dev.hash;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashMapTest {
    private HashMap hashMap;

    @BeforeEach
    void setup() {
        hashMap = new HashMap();
    }

    @Test
    void assertThatValueWasCorrectlyAdded() {
        hashMap.put(new HashNode(20, "Alex"));
        hashMap.put(new HashNode(10, "Alan"));
        hashMap.put(new HashNode(3, "Bob"));
        hashMap.put(new HashNode(2, "Jason"));

        HashNode node = hashMap.get(7);
        assertNull(node);

        node = hashMap.get(20);
        assertNotNull(node);
        assertEquals("Alex", node.getValue());

        node = hashMap.get(3);
        assertNotNull(node);
        assertEquals("Bob", node.getValue());
        
        node = hashMap.get(2);
        assertNotNull(node);
        assertEquals("Jason", node.getValue());

    }
}
