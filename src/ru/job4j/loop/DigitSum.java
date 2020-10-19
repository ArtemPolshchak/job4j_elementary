package ru.job4j.loop;

public class DigitSum {

    public static int sum(int num) {
        int summ = 0;
        for (int i = num; i != 0; i /= 10) {
            summ += i % 10;
        }
        return summ;
    }
}