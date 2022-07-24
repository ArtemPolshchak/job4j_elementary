package javarush.eighteen;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Artem Polshchak on 01.02.2022.
 * @project javaRush
 * Реверс файла
 * Java Core
 * 8 уровень, 5 лекция
 * Реверс файла
 * Java Core
 * 8 уровень, 5 лекция
 */
public class ReverseFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        List<Integer> list = new ArrayList<>();

        while (inputStream.available() > 0) {
            list.add(inputStream.read());
        }
        Collections.reverse(list);
        for (Integer integer : list) {
            outputStream.write(integer);
        }

        inputStream.close();
        outputStream.close();
    }
}
