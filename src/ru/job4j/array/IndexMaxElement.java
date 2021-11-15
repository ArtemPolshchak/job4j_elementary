package ru.job4j.array;

public class IndexMaxElement {
    public static int getIndexMax(int[] array) {
        int rsl = array[0] > array[array.length - 1] ? 0 : array.length - 1;
        return rsl;
    }
}
