package javarush.eight;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Чтение файла
*/

public class task13task1318 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream name = new FileInputStream(reader.readLine());

        while (name.available() > 0) {
            System.out.print((char) name.read());
        }
            reader.close();
            name.close();

    }
}