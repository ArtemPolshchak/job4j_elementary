package ru.job4j.algorithms;

/**
 * @author User on 15.12.2021.
 * @project job4j_elementary
 */
public class FindMinElement {
    public static void main(String[] args) {
        int[] array = new int[] {
                83, 67, 64, 37, 28, 54, 58, 32
        };

        int minValue = array[0];
        int minIndex = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a] < minValue) {
                minValue = array[a];
                minIndex = a;
            }
        }

        System.out.println(minIndex);
        System.out.println(minValue);


    }
}
