package ru.job4j.array;

public class Sequence {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {1, 2}, {3, 4, 5}, {4, 5, 6, 7}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("размер вложенного массива = " + numbers[i].length);
        }

    }
}
