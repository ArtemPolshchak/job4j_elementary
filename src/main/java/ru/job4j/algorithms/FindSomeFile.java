package ru.job4j.algorithms;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FindSomeFile {
    public static void main(String[] args) {
        List<File> fileList = new ArrayList<>();
        searchFiles(new File("D:\\"), fileList);
        for (File file : fileList) {
            System.out.println(file.getAbsoluteFile());
        }

    }

    /**
     * Метод осуществляет поиск файла в папке
     * @param rootFile
     * @param fileList
     */

    private static void searchFiles(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            System.out.println("searching at: " + rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFiles(file, fileList);
                    } else {
                        if (file.getName().toLowerCase(Locale.ROOT).endsWith("jpg")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}
