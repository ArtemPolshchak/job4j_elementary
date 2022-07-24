package javarush.eighteen;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Artem Polshchak on 01.02.2022.
 * @project javaRush
 * Разделение файла
 * Java Core
 * 8 уровень, 5 лекция
 * Считать с консоли три имени файла: файл1, файл2, файл3.
 * Разделить файл1 по следующему критерию:
 * Первую половину байт записать в файл2, вторую половину байт записать в файл3.
 * Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
 * Закрыть потоки.
 */
public class SeparateFile {
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputFirstFile = new FileInputStream(reader.readLine());
        FileOutputStream outputStreamFileTwo = new FileOutputStream(reader.readLine());
        FileOutputStream outputStreamFileThree = new FileOutputStream(reader.readLine());

        while (inputFirstFile.available() > 0) {
            list.add(inputFirstFile.read());
        }

        if (list.size() % 2 == 0) {
            int listSize = list.size() / 2;
            for (int i = 0; i < listSize; i++) {
                outputStreamFileTwo.write(list.get(i));
            }
            for (int i = listSize; i < list.size(); i++) {
                outputStreamFileThree.write(list.get(i));
            }
        } else {
            int listSize = (list.size() / 2) + 1;
            for (int i = 0; i < listSize; i++) {
                outputStreamFileTwo.write(list.get(i));
            }
            for (int i = listSize; i < list.size(); i++) {
                outputStreamFileThree.write(list.get(i));
            }
        }

        inputFirstFile.close();
        outputStreamFileTwo.close();
        outputStreamFileThree.close();

    }
}
