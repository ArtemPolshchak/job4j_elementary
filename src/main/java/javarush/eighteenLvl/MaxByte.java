package javarush.eighteenLvl;

import java.io.*;

/**
 * @author Artem Polshchak on 28.01.2022.
 * @project javaRush Задачи на FileInputStream, FileOutputStream
 * Java Core
 * 8 уровень, 3 лекция
 * Ввести с консоли имя файла.
 * Найти максимальный байт в файле, вывести его на экран.
 * Закрыть поток ввода-вывода.
 */
public class MaxByte {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dataFile = reader.readLine();
        FileInputStream inputStream = new FileInputStream(dataFile);
        int res = 0;

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data >= res) {
                res = data;
            }
        }
        inputStream.close();
        System.out.println(res);

    }
}
