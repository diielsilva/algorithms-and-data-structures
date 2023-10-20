package com.diel.dev.algoritmhs.sort.insertion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {
    private InsertionSort insertion;

    @BeforeEach
    void setup() {
        insertion = new InsertionSort(new Integer[] { 5, 15, 35, 20, 3, 1 });
    }

    @Test
    void assertThatArrayWasCorrectlySorted() {
        insertion.sortNumbers();
        assertEquals(1, insertion.getNumbers()[0]);
        assertEquals(3, insertion.getNumbers()[1]);
        assertEquals(5, insertion.getNumbers()[2]);
        assertEquals(15, insertion.getNumbers()[3]);
        assertEquals(20, insertion.getNumbers()[4]);
        assertEquals(35, insertion.getNumbers()[5]);
    }
}
