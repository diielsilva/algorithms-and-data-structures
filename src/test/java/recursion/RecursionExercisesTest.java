package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        assertEquals("leinaD", reversed);
    }

    @Test
    void assertThatFactorialWasCorrectlyDisplayed() {
        int result = exercises.factorialOfANumber(4, 1, 1);
        assertEquals(24, result);
    }

    @Test
    void assertThatIsAPrimeNumber() {
        boolean result = exercises.primeNumber(5, 1);
        assertTrue(result);
    }

    @Test
    void assertThatListWasInverted() {
        int[] array = exercises.invertAnArray(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 6, 6 / 2);
        assertEquals(7, array[0]);
        assertEquals(6, array[1]);
        assertEquals(5, array[2]);
        assertEquals(4, array[3]);
        assertEquals(3, array[4]);
        assertEquals(2, array[5]);
        assertEquals(1, array[6]);
    }
}
