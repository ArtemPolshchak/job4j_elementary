package javarush.five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.
*/

public class ChangeNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String> list = new ArrayList<>();
       int n = Integer.parseInt(reader.readLine());
       int m = Integer.parseInt(reader.readLine());

       while (n > 0) {
           list.add(reader.readLine());
           n--;
       }
       for (int i = 0; i < m; i++) {
           String a = list.get(0);
           list.remove(0);
           list.add(a);
       }
       for (String s : list) {
           System.out.println(s);
       }
    }
}
