package javarush.collections;


import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author User on 17.06.2022.
 * @project job4j_elementary
 * Находим все файлы
 */

public class FindAllFiles {
    public static List<String> getFileTree(String root) throws IOException {
        return Files.walk(Paths.get(root)).filter(Files::isRegularFile)
                .map(Path::toAbsolutePath).map(Path::toString).collect(Collectors.toList());
    }

    public static void main(String[] args) throws Exception {
        List<String> list = getFileTree("D:\\lego");
        for (String s : list) {
            System.out.println(s);
        }
    }
}