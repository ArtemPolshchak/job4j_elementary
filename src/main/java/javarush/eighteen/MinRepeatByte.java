package javarush.eighteen;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Artem Polshchak on 28.01.2022.
 * @project javaRush Задачи на FileInputStream, FileOutputStream
 * Самые редкие байты
 * Java Core
 * 8 уровень, 3 лекция
 * Ввести с консоли имя файла.
 * Найти байт или байты с минимальным количеством повторов.
 * Вывести их на экран через пробел.
 * Закрыть поток ввода-вывода.
 */
public class MinRepeatByte {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String dataFile = reader.readLine();
        FileInputStream inputStream = new FileInputStream(dataFile);
        List<Integer> listIn = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            listIn.add(data);
        }
        inputStream.close();

        for (Integer s : listIn) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int maxValue = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() <= maxValue) {
                maxValue = entry.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                resultList.add(entry.getKey());
            }
        }

        for (Integer s : resultList) {
            System.out.print(s + " ");
        }

    }
}
