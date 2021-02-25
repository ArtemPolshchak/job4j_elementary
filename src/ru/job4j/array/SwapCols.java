package ru.job4j.array;

import java.util.Arrays;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int temp;
        for (int i = 0; i < data.length; i++) {
            temp = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = temp;
        }
    }
}

