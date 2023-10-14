package com.diel.dev.recursion;

public class RecursionExercises {

    public String writeNaturalNumbers(String result, int number) {
        result += number + "  ";
        if (number == 50) {
            System.out.println(result);
            return result;
        }
        return writeNaturalNumbers(result, ++number);
    }

    public int sumNumbersAtEndPoint(int number, int endpoint, int sum) {
        sum += number;
        if (number == endpoint) {
            System.out.println("The sum of numbers from 1 to " + endpoint + ": " + sum);
            return sum;
        }
        return sumNumbersAtEndPoint(++number, endpoint, sum);
    }

    public String showFibonacciSmallerThanTwenty(int startpoint, int endpoint, int firstPrevious, int secondPrevious,
            String result) {

        if (startpoint < 3) {
            result += 1 + "  ";
            firstPrevious = 1;
            secondPrevious = 1;
        } else if (startpoint == endpoint) {
            result += firstPrevious + secondPrevious + "  ";
            System.out.println(result);
            return result;
        } else {
            result += firstPrevious + secondPrevious + "  ";
            firstPrevious += secondPrevious;
            secondPrevious = firstPrevious - secondPrevious;
        }

        return showFibonacciSmallerThanTwenty(++startpoint, endpoint, firstPrevious, secondPrevious, result);
    }
}
