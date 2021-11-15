package ru.job4j.array;

public class OddPrint {
    public static void print(int[] array) {
        //2 варианта реализации
        /*
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
         */
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}