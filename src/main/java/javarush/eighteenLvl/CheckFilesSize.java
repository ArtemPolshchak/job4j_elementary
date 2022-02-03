package javarush.eighteenLvl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Artem Polshchak on 01.02.2022.
 * @project javaRush
 * DownloadException
 * Java Core
 * 8 уровень, 5 лекция
 * 1 Считывать с консоли имена файлов.
 * 2 Если файл меньше 1000 байт, то:
 * 2.1 Закрыть потоки работы с файлами.
 * 2.2 Выбросить исключение DownloadException.
 */
public class CheckFilesSize {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileInputStream file = new FileInputStream(reader.readLine())) {
            if (file.getChannel().size() < 1000) {
                file.close();
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {
    }
}
