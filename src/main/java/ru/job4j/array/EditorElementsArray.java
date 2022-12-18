package ru.job4j.array;

import java.util.Arrays;

public class EditorElementsArray {
    public static int[][] changeData(int[][] array, int el) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int different = 0;
                if (array[i][j] <= el) {
                    array[i][j] = 0;
                } else {
                    different = array[i][j] - el;
                    array[i][j] = different;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 8, 3}, {2, 4, 11}, {-10, 6, 5}};
        int el = 3;
        System.out.println(Arrays.deepToString(changeData(array, el)));
    }
}
