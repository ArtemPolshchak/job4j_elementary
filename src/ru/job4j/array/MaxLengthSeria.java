package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 0;

        int tmp = 0;
        int[] tmpCounts = new int[array.length];

        for (int index = 0; index < array.length; index++) {

            if (array[index] >= tmp) {
                tmp = array[index];
                count++;
            } else {
                  tmpCounts[0] = count;

                count = 0;

            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(find(new int[] {2, 3, 4, 5}));
    }
}

