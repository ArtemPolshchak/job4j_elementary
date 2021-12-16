package ru.job4j.algorithms;

/**
 * @author User on 16.12.2021.
 * @project job4j_elementary
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        //сортировка выборкой
        for (int step = 0; step < array.length; step++) {
            int index = min(array, step);
            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }
    }

    private static int min(int[] array, int start) {
        int minIndex = 0;
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
