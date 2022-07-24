package javarush.eighteen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.

Требования:
•	Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
•	Для каждого файла создай нить ReadThread и запусти ее.
•	После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
•	Затем нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
•	Поток для чтения из файла в каждой нити должен быть закрыт.
*/

public class FindMaxByteInFile {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) {
                break;
            }
            ReadThread thread = new ReadThread(fileName);
            thread.start();
        }
        reader.close();
        for (Map.Entry<String, Integer> pair : resultMap.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static class ReadThread extends Thread {
        private final String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (FileInputStream fis = new FileInputStream(fileName)) {
                List<Integer> bytes = new ArrayList<>();
                int max = 0;
                int y = -1;
                while (fis.available() > 0) {
                    int data = fis.read();
                    bytes.add(data);
                }

                for (Integer s : bytes) {
                    int count = Collections.frequency(bytes, s);
                    if (count > max) {
                        y = s;
                        max = count;
                    }
                }
                resultMap.put(fileName, y);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
