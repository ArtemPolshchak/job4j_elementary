package javarush.eight;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
Сортировка четных чисел из файла
*/
public class ReadFileThenWriteIntoFile {
    public static void main(String[] args) {

        FileInputStream fis = null;
        InputStreamReader isr = null;

        FileWriter fr = null;
        File file = null;

        int countBytes = 0;

        try {
            fis = new FileInputStream("D:/1.txt");
            isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            file = new File("D:/2.txt");
            fr = new FileWriter(file, true);

            while ((countBytes = isr.read()) != -1) {
                if (countBytes % 2 == 0) {
                    fr.write((char) countBytes);
                }
            }
        }  catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}