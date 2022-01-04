package javarush.eight;

import java.io.InputStreamReader;
import java.io.*;


/**
чтение информации из файла
*/

public class ReadInfoFromFile {
    public static void main(String[] args)  {
        FileInputStream fis = null;
        InputStreamReader isr = null;

        int b = 0;
        try {

            fis = new FileInputStream("D:/1.txt");
            isr = new InputStreamReader(fis);
           // isr = new InputStreamReader(fis, StandardCharsets.UTF_8); оба варианта работают
            while ((b = isr.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
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
        }
    }
}
