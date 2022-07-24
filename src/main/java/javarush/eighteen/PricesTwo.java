package javarush.eighteen;

import java.io.*;
import java.util.ArrayList;

/*
Прайсы
CRUD для таблицы внутри файла.
Напиши программу, которая считывает с консоли путь к файлу для операций CRUD и при запуске в зависимости от флага, переданного в параметрах обновляет данные товара с заданным id или производит физическое удаление товара с заданным id (удаляет из файла все данные, которые относятся к переданному id).
-u id productName price quantity
-d id

Значения параметров:
-u - флаг, который означает обновление данных товара с заданным id
-d - флаг, который означает физическое удаление товара с заданным id (из файла удаляются все данные, которые относятся к переданному id)
id - id товара, 8 символов
productName - название товара, 30 символов
price - цена, 8 символов
quantity - количество, 4 символа

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity

Данные дополнены пробелами до их длины.

Для чтения и записи файла нужно использовать FileReader и FileWriter соответственно.

Пример содержимого файла:
19847   Шорты пляжные синие           159.00  12
198479  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

public class PricesTwo {
    public static void main(String[] args) throws Exception {
        String[] arg = {"-u", "198478", "Test", "1450", "125"};
        if (args.length != 0 && args[0].equals("-u")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();

            BufferedReader readerFile = new BufferedReader(new FileReader(fileName));

            String line = "";
            ArrayList<String> list = new ArrayList<>();
            while (readerFile.ready()) {
                line = readerFile.readLine();
                String str = line.substring(0, 8).trim();
                int n = Integer.parseInt(str);
                if (n != Integer.parseInt(args[1])) {
                    list.add(line);
                } else {
                    list.add(String.format("%-8d%-30s%-8s%-4s", n, args[2], args[3], args[4]));
                }
            }

            readerFile.close();
            BufferedWriter writerFile = new BufferedWriter(new FileWriter(fileName));
            for (String str: list) {
                writerFile.write(str);
                writerFile.newLine();
            }
            writerFile.close();
        }
        if (args.length != 0 && args[0].equals("-d")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();

            BufferedReader readerFile = new BufferedReader(new FileReader(fileName));

            String line = "";
            ArrayList<String> list = new ArrayList<>();
            while (readerFile.ready()) {
                line = readerFile.readLine();
                String str = line.substring(0, 8).trim();
                int n = Integer.parseInt(str);
                if (n != Integer.parseInt(args[1])) {
                    list.add(line);
                }
            }
            readerFile.close();
            BufferedWriter writerFile = new BufferedWriter(new FileWriter(fileName));
            for (String str: list) {
                writerFile.write(str);
                writerFile.newLine();
            }
            writerFile.close();
        }
    }
}
