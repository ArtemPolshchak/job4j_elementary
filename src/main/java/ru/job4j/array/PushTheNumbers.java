package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {

            int tmp = 0;
            int secondTmp = 0;
            tmp = array[row][column];
            array[row][column] = 0;
        for (int i = row; i < array.length; i++) {
            for (int j = column + 1; j < array[i].length; j++) {
                secondTmp = array[i][j];
                array[i][j] = tmp;
                tmp = secondTmp;
            }
            break;

        }
        tmp = array[row][column + 1];
        for (int i = row; i > 0; i--) {
            for (int j = column - 1; j >= 0; j--) {
                secondTmp = array[i][j];
                array[i][j] = tmp;
                tmp = secondTmp;
            }
            break;
        }
        int number = array[row][column + 1];
        for (int i = row + 1; i < array.length; i++) {

            tmp = array[i][column];
            array[i][column] = number;
            number = tmp;
        }

         number = array[row][column + 1];
        for (int i = row - 1; i >= 0; i--) {

            tmp = array[i][column];
            array[i][column] = number;
            number = tmp;
        }
    }
}
