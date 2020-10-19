package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        //int sum = (int) Math.pow(a, n);
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * a;
        }
        return sum;
    }
}