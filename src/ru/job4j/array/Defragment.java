package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                String point = array[index];
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        String notNull = array[i];
                        array[index] = notNull;
                        array[i] = point;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
}
