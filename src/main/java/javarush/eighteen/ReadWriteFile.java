package javarush.eighteen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Artem Polshchak on 28.01.2022.
 * @project javaRush
 */
public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("d:/1.txt");
        FileOutputStream outputStream = new FileOutputStream("d:/2.txt");

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }
        inputStream.close();
        outputStream.close();
    }
}
