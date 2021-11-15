package ru.job4j.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int count = 0;

        for (int datum : data) {
            if (datum == value) {
                count++;
            }
        }
        return count < data.length / 2;
    }
}
