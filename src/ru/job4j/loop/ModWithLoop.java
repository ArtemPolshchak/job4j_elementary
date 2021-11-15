package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = n - d;
            if (res > 0) {
                res = res - d;
                if (res < 0) {
                    res = res + i;
                }

            }
        }
        return res;
    }
}
