package javarush.fourLvl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task04task0443 {
    /*Ввести с клавиатуры строку name.
    Ввести с клавиатуры дату рождения (три числа): y, m, d.

    Вывести на экран текст:
            "Меня зовут name.
    Я родился d.m.y"

    Пример вывода:
    Меня зовут Вася.
    Я родился 15.2.1988
    Требования:
            •	Программа должна считывать строки c клавиатуры.
            •	Программа должна выводить строки на экран.
            •	Программа должна выводить текст, шаблон которого указан в задании.
            •	Каждое предложение вывести с новой строки.*/

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int day = Integer.parseInt(reader.readLine());
        int month = Integer.parseInt(reader.readLine());
        int year = Integer.parseInt(reader.readLine());

        System.out.println("Меня зовут " + name + "." );
        System.out.println("Я родился " + day + "." + month + "."  + year);

    }

}
