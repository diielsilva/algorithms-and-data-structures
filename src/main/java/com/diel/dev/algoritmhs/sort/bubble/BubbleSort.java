package com.diel.dev.algoritmhs.sort.bubble;

public class BubbleSort {
    private Integer[] numbers;

    public BubbleSort(Integer[] numbers) {
        this.numbers = numbers;
    }

    public Integer[] getNumbers() {
        return numbers;
    }

    public void sortNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
    }

}
