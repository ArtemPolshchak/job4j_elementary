package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
      int res = 0;
        for (int i = a; i <= b; i += 2) {
            res += i;
        }
        return res;
    }
}
