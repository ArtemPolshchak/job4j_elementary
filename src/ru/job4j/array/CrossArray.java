package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        int temp = 0;
        for (int i = 0; i < left.length; i++) {
            if (right[temp] == left[i]) {
                System.out.println(left[i]);
            } else if (left[temp] == right[i]) {
                System.out.println(right[i]);
            }
        }
        temp++;
    }
}


