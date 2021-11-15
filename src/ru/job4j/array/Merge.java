package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int lIndex = 0;
        int rIndex = 0;
        while (i < rsl.length) {

                if (lIndex >= left.length) {
                    rsl[i] = right[rIndex++];
                } else if (rIndex >= right.length) {
                    rsl[i] = left[lIndex++];
                } else {
                    rsl[i] = left[lIndex] <= right[rIndex] ? left[lIndex++] : right[rIndex++];
                }
            i++;
        }

        return rsl;
    }
}
