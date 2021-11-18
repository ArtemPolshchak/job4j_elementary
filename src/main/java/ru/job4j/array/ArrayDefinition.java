package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        System.out.println("размер массива ages " + ages.length);
        System.out.println("размер массива surname " + surname.length);
        System.out.println("размер массива prices " + prices.length);
        System.out.println();

        String[] names = new String[4];
        names[0] = "Николай Петров";
        names[1] = "Семен Семеныч";
        names[2] = "Виктор Павлик";
        names[3] = "Руслан Белый";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
