package ru.job4j.array;

public class Sequence {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {1, 2}, {3, 4, 5}, {4, 5, 6, 7}};
        for (int[] number : numbers) {
            System.out.println("размер вложенного массива = " + number.length);
        }
    }
}
