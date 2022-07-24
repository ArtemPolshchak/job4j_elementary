package javarush.eighteen;

import java.io.*;

/*
Округление чисел

Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.

Принцип округления:
3.49 => 3
3.50 => 4
3.51 => 4
-3.49 => -3
-3.50 => -3
-3.51 => -4

Требования:
Программа должна два раза считать имена файлов с консоли.
Для первого файла создай поток для чтения. Для второго - поток для записи.
Считать числа из первого файла, округлить их и записать через пробел во второй.
Должны соблюдаться принципы округления, указанные в задании.
Созданные для файлов потоки должны быть закрыты.
*/

public class RoundNumbersInFiles {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file1));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2))) {
            while (fileReader.ready()) {
              for (String d : fileReader.readLine().split(" ")) {
                  fileWriter.write(Math.round(Double.parseDouble(d)) + " ");
              }
            }
        }
    }
}
