package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        int copy = number;
        int count = 0;
        while (copy > 0) {
        for (int i = 0; i < copy; i++) {
            copy /= 10;
            count++;
        }
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = number % 10;
            number /= 10;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(resolve(12345)));

    }
}
