package javarush.seventeen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Java Core
8 уровень, 11 лекция
10
Придумать механизм шифровки/дешифровки.

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName

где:
fileName - имя файла, который необходимо зашифровать/расшифровать.
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
-e - ключ указывает, что необходимо зашифровать данные.
-d - ключ указывает, что необходимо расшифровать данные.
*/

public class FileEncryption {
    public static void main(String[] args) {
        byte[] one;
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {

            switch (args[0]) {
                case "-e":
                    one = new byte[fileInputStream.available() + 1];
                    while (fileInputStream.available() > 0) {
                        fileInputStream.read(one);
                    }
                    one[one.length - 1] = 1;
                    fileOutputStream.write(one);
                    break;
                case "-d":
                    one = new byte[fileInputStream.available()];
                    while (fileInputStream.available() > 0) {
                        fileInputStream.read(one);
                    }
                    fileOutputStream.write(one, 0, one.length - 1);
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}