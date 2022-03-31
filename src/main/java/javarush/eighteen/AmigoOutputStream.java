package javarush.eighteen;

import java.io.*;

/**
 * @author Artem Polshchak on 01.02.2022.
 * @project javaRush
 * AmigoOutputStream
 * Java Core
 * 8 уровень, 8 лекция
 * 1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используй наследование.
 * 2 При вызове метода close() должны выполняться следующая последовательность действий:
 * 2.1 Вызвать метод flush().
 * 2.2 Записать в конец файла фразу "JavaRush © All rights reserved.", используй метод getBytes().
 * 2.3 Закрыть поток методом close().
 */

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream fileOutputStream;

    public AmigoOutputStream(FileOutputStream name) throws FileNotFoundException {
        super(String.valueOf(name));
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);

    }

    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);

    }

    @Override
    public void close() throws IOException {
        fileOutputStream.flush();
        fileOutputStream.write("JavaRush © All rights reserved.".getBytes());
        fileOutputStream.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
}