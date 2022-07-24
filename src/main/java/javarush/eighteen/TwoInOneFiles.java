package javarush.eighteen;

import java.io.*;

/*
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.

Требования:
•	Программа должна три раза считать имена файлов с консоли.
•	Для первого файла создай поток для записи. Для двух других - потоки для чтения.
•	Содержимое второго файла нужно переписать в первый файл.
•	Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).

*/

public class TwoInOneFiles {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file1));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(file2));
        BufferedReader fileReader3 = new BufferedReader(new FileReader(file3))) {
            while (fileReader3.ready()) {
                while (fileReader2.ready()) {
                    fileWriter.write(fileReader2.read());
                }
                fileWriter.write(fileReader3.read());
            }
        }
    }
}
