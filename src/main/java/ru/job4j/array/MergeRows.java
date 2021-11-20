package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                count++;
            }
        }
        int[] tmp = new int[count];
        for (int k = 0; k < tmp.length; k++) {
            int cnt = 0;

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    int r = data[i][j];
                    tmp[cnt] = r;
                    cnt++;
                }

            }
        }
        return tmp;
    }
}
