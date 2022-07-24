package javarush.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
Функциональности маловато!
 Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
 Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.

 Ключевые требования:
 Пустая строка - конец ввода данных.
 Числа могут повторяться.
 Строки всегда уникальны.
 Введенные данные не должны потеряться!
 Затем программа должна выводить содержание HashMap на экран.
 Каждую пару - с новой строки.

 Пример ввода:
 1
 Мама
 2
 Рама
 1
 Мыла

 Пример вывода:
 1 Мыла
 2 Рама
 1 Мама
*/

public class WorkWithLines {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        String stringId = reader.readLine();
        String name;

        while (!stringId.isEmpty()) {
            int id = Integer.parseInt(stringId);
            name = reader.readLine();
            map.put(name, id);
            stringId = reader.readLine();
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}