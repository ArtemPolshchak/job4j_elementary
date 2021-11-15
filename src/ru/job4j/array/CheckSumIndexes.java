package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int countIndexesOfData = 0;
        for (int[] datum : data) {
            for (int j = 0; j < datum.length; j++) {
                countIndexesOfData++;
            }
        }
        int[] array = new int[countIndexesOfData];
        int countForArray = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                array[countForArray++] = data[i][j];

            }

        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (count < sum) {
                count++;
            } else {
                array[i] = 0;
                count = 0;
            }
        }
        return Arrays.copyOf(array, array.length);
    }

    public static void main(String[] args) {

        int[][] data = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
                //expected = {1, 2, 3, 5, 6, 8, 9, 11, 12, 14, 15, 16};

        };
       // System.out.println(Arrays.toString(collectNewArray(data, 3)));

        int countIndexesOfData = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                countIndexesOfData++;
            }
        }

        int[] array = new int[countIndexesOfData];
        int countForArray = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                array[countForArray++] = data[i][j];

            }
        }
        int sum = 3;
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (count < sum) {
                count++;
            } else {
                array[i] = 0;
                count = 0;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(countIndexesOfData);
        System.out.println(Arrays.deepToString(data));
        int[] result = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(result));

    }
}
