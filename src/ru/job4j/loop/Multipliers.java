package ru.job4j.loop;

public class Multipliers {

    public static void out(int n) {
        for (int i = 1; i <= n; i++) {
            int res = n / i;
            if (res * i == n) {
                System.out.println(i);
            }
        }

    }
}
