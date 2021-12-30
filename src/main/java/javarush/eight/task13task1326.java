package javarush.eight;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
Сортировка четных чисел из файла
 В этой задаче тебе нужно:
 Ввести имя файла с консоли.
 Прочитать из него набор чисел.
 Вывести в консоли только четные, отсортированные по возрастанию.
 Пример ввода:
 5
 8
 -2
 11
 3
 -5
 2
 10

 Пример вывода:
 -2
 2
 8
 10
*/

public class task13task1326 {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        List<Integer> list = new ArrayList<>();

        while (fileReader.ready()) {
            String input = fileReader.readLine();

            if (!input.isEmpty()) {
                try {
                    int digit = Integer.parseInt(input);
                    if (digit % 2 == 0)
                        list.add(digit);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }
        fileReader.close();
        Collections.sort(list);

        for (int s : list) {
            System.out.println(s);
        }
    }
}