package javarush.corenine;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author artem.polschak@gmail.com on 06.05.2022.
 * @project javaRush
 * Использовать класс AdapterFileOutputStream,
 * чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter.
 */
public class AdapterFileOutputStream implements AmigoStringWriter {
    private  FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        fileOutputStream.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }

    public static void main(String[] args) {

    }
}

interface AmigoStringWriter {
    void flush() throws IOException;

    void writeString(String s) throws IOException;

    void close() throws IOException;
}


