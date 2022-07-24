package javarush.eighteen;

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
public class UnsupportedFileNameException extends Exception {
}
