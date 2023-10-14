package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.diel.dev.recursion.RecursionExercises;

class RecursionExercisesTest {
    private RecursionExercises exercises;

    @BeforeEach
    void setup() {
        exercises = new RecursionExercises();
    }

    @Test
    void assertThatNumbersAreReturned() {
        String result = exercises.writeNaturalNumbers("", 1);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    void assertThatNumbersAreCorrectlyAdded() {
        int result = exercises.sumNumbersAtEndPoint(1, 5, 0);
        assertEquals(15, result);
    }

    @Test
    void assertThatFibonacciSequenceIsCorrectlyDisplayed() {
        String result = exercises.showFibonacciSmallerThanTwenty(1, 10, 0, 0, "");
        assertNotNull(result);
        assertNotEquals("", result);
    }
}
