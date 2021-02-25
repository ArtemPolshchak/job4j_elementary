package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 0;

        int tmp = 0;
        int num1 = 0;
        int res = 0;

        for (int i : array) {

            if (tmp <= i) {
                tmp = i;
                count++;
            } else {
                num1 = count;

                count = 0;
                tmp = i;
                count++;

            }
        }
        res = Math.max(num1, count);
        return res;

    }
}

