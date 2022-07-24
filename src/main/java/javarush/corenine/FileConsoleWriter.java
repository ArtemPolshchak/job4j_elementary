package javarush.corenine;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter  {
    private FileWriter fileWriter;

    public FileConsoleWriter(String file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(String file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor id) throws IOException {
        this.fileWriter = new FileWriter(id);
    }

    public static void main(String[] args) throws  IOException {
        FileConsoleWriter fileConsoleWriter = new FileConsoleWriter("/home/file.txt");
        char[] buf = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        fileConsoleWriter.write(buf, 5, 5);
        fileConsoleWriter.close();
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        if ((off + len) > cbuf.length) {
            len = cbuf.length - off;
        }
        fileWriter.write(cbuf, off, len);
        System.out.println(String.valueOf(cbuf).substring(off, (len + off)));
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }

    public void write(String str, int off, int len) throws IOException {
        if ((off + len) > str.length()) {
            len = str.length() - off;
        }
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len));
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.println(String.valueOf(cbuf));
    }

    public void close() throws IOException {
        fileWriter.close();
    }
}
