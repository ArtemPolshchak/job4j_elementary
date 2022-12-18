package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int count = 0;
        int[] array = new int[left.length + right.length]; //результирующий массив
        int rlength = right.length;
        //метод чтоб проверить если правый массив пустой, то записать все елементы с левого массива в резултирующий
        if (right.length == 0) {
            return left;
        }

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < rlength; j++) {
                if (left[i] != right[j]) {
                    array[count++] = left[i];

                } else if (left[i] == right[j]) {
                    if (right.length == 1) {
                        break;
                    }
                    array[count] = 0;
                    if (array[count] == 0 || array[count - 1] != left[i - 1]) {
                        count--;
                    }
                    right[j] = right[rlength - 1];
                    rlength--;
                    if (rlength == 0) {
                        array[count++] = left[i + 1];
                    }
                }
            }
        }
        return Arrays.copyOf(array, count);
    }

}
