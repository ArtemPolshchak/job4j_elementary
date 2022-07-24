package javarush.eighteen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Artem Polshchak on 28.01.2022.
 * @project javaRush Задачи на FileInputStream, FileOutputStream
 * Сортировка байт
 * Java Core
 * 8 уровень, 3 лекция
 * Ввести с консоли имя файла.
 * Считать все байты из файла.
 * Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
 * Вывести на экран.
 * Закрыть поток ввода-вывода.
 *
 * Пример байт входного файла:
 * 44 83 44
 *
 * Пример вывода:
 * 44 83
 */
public class SortingBytes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dataFile = reader.readLine();
        FileInputStream inputStream = new FileInputStream(dataFile);
        Set<Integer> set = new TreeSet<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            set.add(data);
        }
        inputStream.close();

        for (Integer s : set) {
            System.out.print(s + " ");
        }
    }
}