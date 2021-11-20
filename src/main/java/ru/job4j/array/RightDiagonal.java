package ru.job4j.array;

public class RightDiagonal {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static int[] diagonal(int[][] data) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
                count++;
        }
        int[] tmp = new int[count];
        int n = data.length;
        for (int sell = 0; sell < n; sell++) {

                tmp[sell] = data[sell][n - sell - 1];

        }
        return tmp;
    }
}
