package javarush.five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Меняем функциональность
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
обратная сортировка пузырьком
*/

public class ChangeFunctionality {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        boolean sorted = false;
        int tmp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    sorted = false;
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }

            }
        }
    }
}
