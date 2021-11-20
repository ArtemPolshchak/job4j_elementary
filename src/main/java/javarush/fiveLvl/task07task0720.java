package javarush.fiveLvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.
*/

public class task07task0720 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String> list = new ArrayList<>();
       int N = Integer.parseInt(reader.readLine());
       int M = Integer.parseInt(reader.readLine());

       while (N > 0) {
           list.add(reader.readLine());
           N--;
       }
       for (int i = 0; i < M; i++) {
           String a = list.get(0);
           list.remove(0);
           list.add(a);
       }
       for (String s : list) {
           System.out.println(s);
       }
    }
}
