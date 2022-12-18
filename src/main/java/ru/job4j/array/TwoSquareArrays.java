package ru.job4j.array;

import java.util.Arrays;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int count = 0;
        int index = 0;
        for (int[] ints : left) {
            for (int j = 0; j < ints.length; j++) {
                count++;
            }
        }
        int[] mass = new int[count];

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                mass[index] = Math.max(left[i][j], right[i][j]);
                index++;
            }
        }

        return mass;
    }

    public static void main(String[] args) {
        int[][] left = {{1, 10, 55}, {16, 32, 40}, {4, 27, 7}};
        int[][] right = {{2, 4, 92}, {82, 15, 26}, {8, 17, 35}};
        System.out.println(Arrays.toString(collectArray(left, right)));

    }
}
