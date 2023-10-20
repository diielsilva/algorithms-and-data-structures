package com.diel.dev.algoritmhs.sort.insertion;

public class InsertionSort {
    private Integer[] numbers;

    public InsertionSort(Integer[] numbers) {
        this.numbers = numbers;
    }

    public void sortNumbers() {
        for (int i = 1; i < numbers.length; i++) {
            int value = numbers[i];
            int j;

            for (j = i - 1; j >= 0; j--) {
                if (value < numbers[j]) {
                    numbers[j + 1] = numbers[j];
                } else {
                    break;
                }
            }
            numbers[j+1] = value;
        }
    }

    public Integer[] getNumbers() {
        return numbers;
    }

}
