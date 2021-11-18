package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int arrLen = (int) Math.ceil(Math.sqrt(array.length));
        int[][] res = new int[arrLen][arrLen];
        int count = 0;

        for (int row = 0; row < res.length; row++) {
            for (int cell = 0; cell < res[row].length; cell++) {
                if (count < array.length) {
                    res[row][cell] = array[count++];
                } else {
                    res[row][cell] = 0;
                }
            }
        }

        return res;
    }
}
