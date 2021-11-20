package ru.job4j.array;

public class NoConsecutive {
    public static int find(int[] data) {

        int result = -1;
        for (int i = 0; i < data.length -1; i++) {
            int num = data[i];
            if (num + 1 == data[i + 1]) {
                return  result;
            } else {
                 result = data[i + 1];
            }

        }
        return result;
    }
}
