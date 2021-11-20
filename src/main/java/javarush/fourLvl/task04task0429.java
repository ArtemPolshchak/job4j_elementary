package javarush.fourLvl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task04task0429 {
   /* Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
            "количество отрицательных чисел: а", "количество положительных чисел: б",
    где а, б - искомые значения.
    Пример:
    а) при вводе чисел
        2
        5
        6
    получим вывод
    количество отрицательных чисел: 0
    количество положительных чисел: 3

    Пример:
    б) при вводе чисел
        -2
        -5
        6
    получим вывод
    количество отрицательных чисел: 2
    количество положительных чисел: 1
    Требования:
            •	Программа должна считывать числа c клавиатуры.
            •	Программа должна выводить текст на экран.
            •	Программа должна выводить количество отрицательных чисел в исходном наборе.
•	Программа должна выводить количество положительных чисел в исходном наборе.
•	Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
            •	Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
            •	Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());
        countOfEvenOddNumbers(first, second, third);

    }

    public static void countOfEvenOddNumbers(int a, int b, int c) {
        ArrayList<Integer> list = new ArrayList<>();

        int countPositive = 0;
        int countNegative = 0;
        list.add(a);
        list.add(b);
        list.add(c);
        for (int n : list) {
            if (n > 0) {
                countPositive++;
            } else if (n < 0) {
                countNegative++;
            }
        }
        if (countNegative > 0  ) {
            System.out.println("количество отрицательных чисел: " + countNegative);
        } else  {
            System.out.println("количество отрицательных чисел: 0");

        } if (countPositive > 0) {
            System.out.println("количество положительных чисел: " + countPositive);
        } else {
            System.out.println("количество положительных чисел: 0");
        }

    }
}
