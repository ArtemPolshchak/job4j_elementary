package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {

        int[] merge = new int[left.length + right.length];
        int count = 0;

        for (int i = 0; i < left.length; i++) {
            merge[count++] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            merge[count++] = right[i];
        }
        Arrays.sort(merge);
        int k = merge.length;

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (merge[i] == merge[j]) {
                    merge[j] = merge[k - 1];
                    k--;
                    j--;
                }
            }
        }
        int[] lastResult = new int[k];
        for (int i = 0; i < k; i++) {
            lastResult[i] = merge[i];
        }
        Arrays.sort(lastResult);
        return lastResult;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 7, 7};
        int[] test2 = {1, 3, 4, 5, 6, 1};

        System.out.println(Arrays.toString(or(test, test2)));
    }
}
