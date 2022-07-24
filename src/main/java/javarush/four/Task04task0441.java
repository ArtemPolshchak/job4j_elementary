package javarush.four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task04task0441 {

    /*Ввести с клавиатуры три числа, вывести на экран среднее из них.
    Т.е. не самое большое и не самое маленькое.
    Если все числа равны, вывести любое из них.

            Требования:
            •	Программа должна считывать числа c клавиатуры.
            •	Программа должна выводить число на экран.
            •	Программа должна выводить среднее из трех чисел.
            •	Если все числа равны, вывести любое из них.
            •  	Если два числа из трех равны, вывести любое из двух.*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());

        int max = Math.max(Math.max(first, second), third);
        int min = Math.min(Math.min(first, second), third);

        if (first != max && first != min || first == second || first == third) {
            System.out.println(first);
        } else if (second != max && second != min  || second == third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }
}
