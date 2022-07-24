package javarush.four;

import java.io.BufferedReader;
        import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task04task0428 {
  /*  Ввести с клавиатуры три целых числа.
    Вывести на экран количество положительных чисел среди этих трех.

    Примеры:
    а) при вводе чисел
        -4
        6
        6
    получим вывод
    2

    б) при вводе чисел
        -6
        -6
        -3
    получим вывод
        0
    в) при вводе чисел
        0
        1
        2
    получим вывод
        2
    Требования:
    Программа должна считывать числа c клавиатуры.
    Программа должна выводить число на экран.
    Программа должна выводить количество положительных чисел в исходном наборе.
    Если положительных чисел нет, программа должна вывести "0".
    Учти, что "0" не относится ни к положительным, ни к отрицательным числам.*/

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());

        int count = countEvenNum(first, second, third);
        System.out.println(count);

    }

    public static int countEvenNum(int a, int b, int c) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        for (int n : list) {
            if (n > 0) {
                count++;
            }
        }
        return count;
    }
}
