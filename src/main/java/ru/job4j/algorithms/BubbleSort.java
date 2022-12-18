package ru.job4j.algorithms;

public class BubbleSort {
    /**
     * Сортировка пузырьком
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[] {
                64, 52, 74, 61, 57, 34, 26, 75
        };
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }

        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
