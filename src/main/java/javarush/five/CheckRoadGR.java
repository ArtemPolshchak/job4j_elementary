package javarush.five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/

public class CheckRoadGR {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        while (count < 10) {
                list.add(reader.readLine());
                count++;
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < list.get(i - 1).length()) {
                count = i;
                System.out.println(count);
                break;
            }

        }

    }
}
