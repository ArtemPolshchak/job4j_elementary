package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }

        int arrLen = (int) Math.ceil(Math.sqrt(count));
        int[][] res = new int[arrLen][arrLen];

        int[] mass = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                mass[index] = array[i][j];
                index++;
            }
        }
        int countForRes = 0;

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                if (countForRes < mass.length) {
                    res[i][j] = mass[countForRes++];
                } else {
                    res[i][j] = 0;
                }
            }
        }
        return res;
    }
}
