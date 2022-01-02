package javarush.eight;

import java.io.*;

/**
 * запись информации в файл
 */
public class WriteInfoIntoFile {
    public static void main(String[] args) {
        FileWriter fr = null;
        String str = "Hot";
        File file = new File("D:/1.txt"); //создается новый файл, если такого еще нет

        try {
           fr = new FileWriter(file, true); //файл дописывается,
            // но если убрать true, то файл будет перезаписываться

           fr.write(str);
        }  catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
