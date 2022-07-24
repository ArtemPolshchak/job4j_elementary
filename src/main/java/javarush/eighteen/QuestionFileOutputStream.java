package javarush.eighteen;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Artem Polshchak on 01.02.2022.
 * @project javaRush
 * Расширяем AmigoOutputStream
 * Java Core
 * 8 уровень, 8 лекция
 * Используя шаблон проектирования Wrapper (Decorator) расширь функциональность AmigoOutputStream.
 * В классе QuestionFileOutputStream при вызове метода close() должна быть реализована следующая функциональность:
 * 1. Вывести в консоль фразу "Вы действительно хотите закрыть поток? Д/Н".
 * 2. Считай строку.
 * 3. Если считанная строка равна "Д", то закрыть поток.
 * 4. Если считанная строка не равна "Д", то не закрывать поток.
 */

public class QuestionFileOutputStream implements AmigoOutStream {
    private AmigoOutStream amigoOutputStream;

    public QuestionFileOutputStream(AmigoOutStream amigoOutputStream) {
        this.amigoOutputStream = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);

    }

    @Override
    public void write(byte[] b) throws IOException {
        amigoOutputStream.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b, off, len);

    }

    @Override
    public void close() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String str = reader.readLine();
        if (str.equals("Д")) {
           amigoOutputStream.close();
        }
    }
}
