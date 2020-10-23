package ru.job4j.array;

import java.util.Arrays;

public class TriangleMatrix {

    public static int[][] rows(int count) {

        int[][] triangle = new int[count][];
        int number = 1;
        int number2 = 1;

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[number];

            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = number2++;
            }
            number++;
        }
        return triangle;
    }
}
