package ru.job4j.array;

public class RightDiagonal {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static int[] diagonal(int[][] data) {
        int count = 0;
        int firsttmp = 0;
        for (int i = 0; i < data.length; i++) {
                count++;
        }
        int[] tmp = new int[count];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int r = data[i][j];
                tmp[i] = r;
            }

        }
        return tmp;
    }
}
