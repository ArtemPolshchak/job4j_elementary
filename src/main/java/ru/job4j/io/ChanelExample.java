package ru.job4j.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Artem Polshchak on 08.02.2022.
 * @project Practice IO
 */
public class ChanelExample {
    public static void main(String[] args)throws Exception {
        transferDemo();

        //метод позволяет вместить в массив строк все строки с файла
        List<String> lines = Files.readAllLines(Paths.get("D:\\example.xml"));
        System.out.println(lines.size());
        System.out.println(lines.get(20));
    }

    public static void demoChanel() throws  Exception {
        FileInputStream fileInputStream = new FileInputStream("D:\\example.xml");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\testForRead.xml");
        FileChannel inChanel = fileInputStream.getChannel();
        FileChannel outChanel = fileOutputStream.getChannel();
        ByteBuffer inBuffer = ByteBuffer.allocate(4096);
        ByteBuffer outBuffer = ByteBuffer.allocate(4096);
        int reader = inChanel.read(inBuffer);

        while (reader != -1) {
            inBuffer.flip();

            while (inBuffer.hasRemaining()) {
               byte get = inBuffer.get();
                outBuffer.put(get);
            }
            outBuffer.flip();
            outChanel.write(outBuffer);
            inBuffer.clear();
            outBuffer.clear();
            reader = inChanel.read(inBuffer);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    /**
     * метод записывает байты из одного файла в другой. может записывать с текста в хмл
     * @throws Exception
     */
    public static void transferDemo() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("D:\\outputnpc.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\testForRead.xml");

        FileChannel inChanel = fileInputStream.getChannel();
        FileChannel outChanel = fileOutputStream.getChannel();

        inChanel.transferTo(0, inChanel.size(), outChanel);
    }
}
