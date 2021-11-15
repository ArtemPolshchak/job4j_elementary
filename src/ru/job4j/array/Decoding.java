package ru.job4j.array;

public class Decoding {
    public static int[] decode(int[] ints, int number) {
        int[] result = new int[ints.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = ints[i] % number;
        }
        return result;
    }
}
