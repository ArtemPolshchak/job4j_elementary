package javarush.eighteen;

import java.io.*;
import java.util.*;

/*
Собираем файл
Собираем файл из кусочков.
Считывать с консоли имена файлов.
Каждый файл имеет имя: [someName].partN.

Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.

Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end".
В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].

Например, Lion.avi.

В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки.
Требования:
•	Программа должна считывать имена файлов с консоли, пока не будет введено слово "end".
•	Создай поток для записи в файл без суффикса [.partN] в папке, где находятся все считанные файлы.
•	В новый файл перепиши все байты из файлов-частей *.partN.
•	Чтение и запись должны происходить с использованием буфера.
•	Созданные для файлов потоки должны быть закрыты.
•	Не используй статические переменные.
*/

public class WriteCoupleFilesInOne {
    public static void main(String[] args) throws IOException {
        List<String> setFiles = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = "";
            while (!((fileName = reader.readLine()).equals("end"))) {
                setFiles.add(fileName);
            }
        }
        Set<String> set = new TreeSet<>(setFiles);
        String outFileName = setFiles.get(0).substring(0, setFiles.get(0).lastIndexOf(".part"));
        try (FileOutputStream outputStream = new FileOutputStream(outFileName)) {
            for (String fileNameRead : set) {
                try (FileInputStream inputStream = new FileInputStream(fileNameRead)) {
                    byte[] bytes = new byte[inputStream.available()];
                    // inputStream.read(bytes);
                    outputStream.write(bytes);
                }
            }
        }
    }
}

