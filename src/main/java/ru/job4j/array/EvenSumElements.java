package ru.job4j.array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int datum : data) {
            sum += datum;
        }
        return sum % 2 == 0;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        boolean rsl = EvenSumElements.checkArray(data);
        System.out.println(rsl);
    }
}
