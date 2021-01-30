package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 0;
        int res = 0;

        int tmp = 1;
        int[] tmpCounts = new int[array.length];

        for (int index = 0; index < array.length; index++) {

            if (array[index] >= tmp) {
                tmp = array[index];
                count++;
                res = count;
            } else {
                tmpCounts[index] = count;
                count = 0;
            }

        }
        for (int i = 0; i < tmpCounts.length - 1; i++) {
            if (tmpCounts[i] >= tmpCounts[i + 1]) {
                res = tmpCounts[i];
            }
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(find(new int[] {2, 3, 4, 5}));

    }
}

