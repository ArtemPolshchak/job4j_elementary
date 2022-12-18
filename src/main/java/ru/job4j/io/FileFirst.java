package ru.job4j.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

/**
 * @author Artem Polshchak on 08.02.2022.
 * @project Practice IO
 */
public class FileFirst {

    public static void main(String[] args) throws Exception {
        encodeDemo();
    }

    public static void demoInputOutput() {
        try (
                InputStream stream = new FileInputStream("D:\\npcdata.txt");
                OutputStream outputStream = new FileOutputStream("D:\\outputnpc.txt")) {

            byte[] buffer = new byte[4096];
            int r = stream.read();
            while (r != -1) {
                outputStream.write(buffer, 0, r);
                r = stream.read(buffer);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void demoReadWrite() throws Exception {
        Reader reader = new FileReader("D:\\example.xml");
        Writer writer = new FileWriter("D:\\testForRead.xml");

        char[] buffer = new char[4096];
        int num = reader.read(buffer);

        while (num != -1) {
            writer.write(buffer, 0, num);
            num = reader.read(buffer);
        }
        reader.close();
        writer.close();
    }

    public static void encodeDemo() throws Exception {
        FileInputStream fis = new FileInputStream("D:\\example.xml");
        Reader reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
               line = bufferedReader.readLine();
        }
        fis.close();
        reader.close();
        bufferedReader.close();
    }

    public static void demoMemory() {
        ByteArrayInputStream stream = new ByteArrayInputStream(new byte[10]);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    }
}
