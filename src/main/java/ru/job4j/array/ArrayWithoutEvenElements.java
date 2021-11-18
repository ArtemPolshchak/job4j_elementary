package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
     int[] res = new int[data.length];
     int count = 0;
        for (int datum : data) {
            if (datum % 2 != 0) {
                res[count++] = datum;
            }
        }

        return Arrays.copyOf(res, count);
    }
}
