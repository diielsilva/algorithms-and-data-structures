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

    public String printAnArrayWithRecursion(int actualIndex, int[] numbers, String result) {
        result += numbers[actualIndex] + "  ";
        if (actualIndex == numbers.length - 1) {
            System.out.println(result);
            return result;
        }
        return printAnArrayWithRecursion(++actualIndex, numbers, result);
    }

    public String printNumberOfDigits(int number, int digits) {
        if (String.valueOf(number).length() == digits) {
            String result = "The number of digits in the number: " + number + " is: " + digits;
            System.out.println(result);
            return result;

        }
        return printNumberOfDigits(number, ++digits);
    }

    public String printSumOfANumber(int number, int stopCondition, int sum) {
        String value = Integer.toString(number);
        sum += Character.getNumericValue(value.charAt(stopCondition));

        if (String.valueOf(number).length() - 1 == stopCondition) {
            String result = "The sum of digits of " + number + " = " + sum;
            System.out.println(result);
            return result;
        }
        return printSumOfANumber(number, ++stopCondition, sum);
    }

}
