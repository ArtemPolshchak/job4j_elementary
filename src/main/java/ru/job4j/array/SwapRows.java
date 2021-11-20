package ru.job4j.array;

public class SwapRows {
        public static void swap(int[][] data, int src, int dst) {
            int[] tmp = data[src];
            data[src] = data[dst];
            data[dst] = tmp;

        }
    }
