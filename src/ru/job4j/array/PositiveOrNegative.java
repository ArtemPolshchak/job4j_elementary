package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int negativeNumber = 0;
        boolean result = false;

        for (int datum : data) {
            if (datum < 0) {
                negativeNumber++;
            }
        }
        if (negativeNumber % 2 != 0) {
            result = true;
        }

        return result;
    }
}
