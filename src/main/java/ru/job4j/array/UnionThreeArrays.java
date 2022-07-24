package ru.job4j.array;

import java.util.Arrays;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int mass = 2 + middle.length + right.length;
        int[] res = new int[mass];
        int count = 0;

        for (int i = 0; i < 1; i++) {

            res[i] = left[i];
            count++;
        }
        for (int j = 0; j < left.length; j++) {
            if (right[j] % 2 != 0) {
                res[count++] = right[j];

            } else {
                res[count++] = middle[j];
            }
        }

        for (int i = 0; i < 1; i++) {

            res[count++] = left[left.length - 1];

        }

        return Arrays.copyOf(res, count);

    }

}