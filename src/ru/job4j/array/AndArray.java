package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int count = 0;
        int arrayLength = 0;
        if (left.length >= right.length) {
            arrayLength = left.length;
        } else {
            arrayLength = right.length;
        }
        int[] result = new int[arrayLength];

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    result[j] = right[j];
                    count++;
                }
            }

        }
        return Arrays.copyOf(result, count);

    }
}