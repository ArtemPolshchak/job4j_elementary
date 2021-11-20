package ru.job4j.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        for (int i = 2; i < data.length; i++) {
            if (data[i - 1] + data[i - 2] != data[i]) {
                rsl = false;
                break;
            }
        }

        return rsl;
    }
}
