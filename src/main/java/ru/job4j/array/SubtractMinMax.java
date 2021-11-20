package ru.job4j.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int maxNum = 0;

        for (int anInt : ints) {
            if (anInt > maxNum) {
                maxNum = anInt;
            }
        }
        int minNum = maxNum;
        for (int anInt : ints) {
            if (anInt < minNum) {
                minNum = anInt;
            }
        }
        return maxNum - minNum;
    }
}
