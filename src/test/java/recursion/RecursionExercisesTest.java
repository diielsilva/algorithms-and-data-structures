package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void assertThatArrayWasCorrectlyDisplayed() {
        String result = exercises.printAnArrayWithRecursion(0, new int[] { 2, 4, 6, 8, 10, 12 }, "");
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    void assertThatDigitsWasCorrectlyDisplayed() {
        String result = exercises.printNumberOfDigits(50, 0);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    void assertThatSumOfANumberWasCorrectlyDisplayed() {
        String result = exercises.printSumOfANumber(25, 0, 0);
        assertNotNull(result);
        assertNotEquals("", result);
    }

    @Test
    void assertThatLargestWasCorrectlyReturned() {
        int largest = exercises.largestOfAnArray(new int[] { 2, 4, 6, 55, 8, 12, 22 }, 0, 0);
        assertEquals(55, largest);
    }

    @Test
    void assertThatStringWasCorrectlyReversed() {
        String reversed = exercises.reverseAString("Daniel", "", 5);
        assertEquals("leinaD",reversed);
    }

    @Test
    void assertThatFactorialWasCorrectlyDisplayed() {
        int result = exercises.factorialOfANumber(4, 1, 1);
        assertEquals(24, result);
    }

    @Test
    void assertThatIsAPrimeNumber() {
        boolean result = exercises.primeNumber(6, 1);
        assertFalse(result);
    }
}
