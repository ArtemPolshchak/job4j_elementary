package javarush.eight;

import java.io.*;

/**
 Прочесть с консоли имя файла.
 Считывать строки с консоли, пока пользователь не введет строку "exit".
 Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.
*/

public class ReadNameFromConsole {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        writer = new BufferedWriter(new FileWriter(reader.readLine()));

        do {
            name = reader.readLine();
            writer.write(name);
            writer.newLine();
        } while (!(name.equals("exit")));

        writer.close();
    }
}