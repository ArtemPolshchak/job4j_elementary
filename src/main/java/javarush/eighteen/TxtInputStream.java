package javarush.eighteen;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Artem Polshchak on 01.02.2022.
 * @project javaRush
 * UnsupportedFileName
 * Java Core
 * 8 уровень, 8 лекция
 * Измени класс TxtInputStream так, чтобы он работал только с txt-файлами (*.txt).
 * Например, first.txt или name.1.part3.txt.
 * Если передан не txt-файл, например, file.txt.exe,
 * то конструктор должен выбрасывать исключение UnsupportedFileNameException.
 * Подумай, что еще нужно сделать, в случае выброшенного исключения.
 */
public class TxtInputStream extends FileInputStream {
    public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException {
        super(fileName);

        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();

        }
    }

    public static void main(String[] args) throws UnsupportedFileNameException {
    }
}