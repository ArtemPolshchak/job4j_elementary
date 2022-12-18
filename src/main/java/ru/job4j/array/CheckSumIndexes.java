package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {

        int count = 0;
        for (int[] datum : data) {
            for (int j = 0; j < datum.length; j++) {
                count++;
            }
        }
        int[] array = new int[count];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                }
            }
        }

        int cont = 0;

        for (int[] datum : data) {
            for (int i : datum) {
                if (i != 0) {
                    array[cont++] = i;
                }
            }
        }
        return Arrays.copyOf(array, cont);
    }
}
