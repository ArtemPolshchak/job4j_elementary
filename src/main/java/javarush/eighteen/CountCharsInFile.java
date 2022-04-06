package javarush.eighteen;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author User on 03.04.2022.
 * @project job4j_elementary
 * Программа запускается с одним параметром - именем файла, который содержит английский текст.
 * Посчитать частоту встречания каждого символа.
 * Отсортировать результат по возрастанию кода ASCII (почитать в инете).
 *
 * Пример:
 * ','=44, 's'=115, 't'=116.
 *
 * Вывести на консоль отсортированный результат:
 * [символ1] частота1
 * [символ2] частота2
 * Закрыть потоки.
 *
 * Пример вывода:
 * , 19
 * - 7
 * f 361
 *
 * Требования:
 * •	Считывать с консоли ничего не нужно.
 * •	Создай поток для чтения из файла, который приходит первым параметром в main.
 * •	В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
 * •	Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
 * •	Поток для чтения из файла должен быть закрыт.
 */
public class CountCharsInFile {
    public static void main(String[] args) throws IOException {
        /* if (args.length == 0) {
            throw new IllegalArgumentException();
        }*/
        Map<Character, Integer> map = new TreeMap<>();
        String file = "time.txt";

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            while (fileReader.ready()) {
                int count = 1;
                char charStr = (char) fileReader.read();
                        if (map.containsKey(charStr)) {
                            int tmpCount = map.get(charStr) + 1;
                            map.replace(charStr, tmpCount);
                        } else {
                            map.put(charStr, count);
                        }
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
