package ru.job4j.io;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Artem Polshchak on 08.02.2022.
 * @project Practice IO
 */
public class FileSystem {
    public static void main(String[] args) throws Exception {
        File file = new File(".");
        String[] strings = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("p");
            }
        });

        for (String s : strings) {
            System.out.println(s);
        }

        Path path = Paths.get("D:\\example.xml");
        Files.lines(path);
        Stream<String> lines = Files.lines(path);
        lines.forEach(System.out::println);
    }
}
