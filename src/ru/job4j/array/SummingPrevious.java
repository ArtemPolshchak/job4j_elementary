package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int sum = a + b;
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;

        for (int i = 2; i < array.length; i++) {
           array[i] += sum;
           sum += sum;
        }
        return array;
    }
}
