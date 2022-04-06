package javarush.eighteen;

import java.io.*;

/**
 * @author Artem Polshchak on 31.01.2022.
 * @project javaRush
 * Подсчет запятых
 * Java Core
 * 8 уровень, 5 лекция
 * С консоли считать имя файла.
 * Посчитать в файле количество символов ',', количество вывести на консоль.
 * Закрыть потоки.
 *
 * Подсказка:
 * нужно сравнивать с ascii-кодом символа ','.
 */
public class CountComma {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int res = 0;
        while (inputStream.available() > 0) {
            if (inputStream.read() == ',') {
                res++;
            }
        }
        inputStream.close();
        System.out.println(res);
    }
}

