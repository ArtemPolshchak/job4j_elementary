package javarush.eighteen;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;

/*
Поиск данных внутри файла
Считать с консоли имя файла.
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int).
Закрыть потоки.

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity
где id - int.
productName - название товара, может содержать пробелы, String.
price - цена, double.
quantity - количество, int.

Информация по каждому товару хранится в отдельной строке.

Пример содержимого файла:
194 хлеб 12.6 25
195 масло сливочное 52.2 12
196 молоко 22.9 19

Пример вывода для id = 195:
195 масло сливочное 52.2 12
Требования:
•	Программа должна считать имя файла с консоли.
•	Создай для файла поток для чтения.
•	Программа должна найти в файле и вывести информацию о id, который передается первым параметром.
•	Поток для чтения из файла должен быть закрыт.
*/

public class FindDataInFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
         String[] arg = {"195", "productName", "price", "quantity"};
            for (String s : arg) {
                System.out.print(s + " ");
            }
        System.out.println();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file1))) {
            while (fileReader.ready()) {
                String[] info = fileReader.readLine().split(" ");
                if (arg[0].trim().equals(info[0].trim())) {
                    for (String s : info) {
                        System.out.print(s + " ");
                    }
                    break;
                }
            }
        }
    }
}
