package javarush.eight;



import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


/**
 * @author Artem Polshchak on 30.12.2021.
 * @project JavaRush Файл в статическом блоке
 * Java Core
 * 5 уровень, 12 лекция
 * Для решения этой задачи:
 * Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
 * В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.
 */
public class FileInStaticBlock {
    public static List<String> lines = new ArrayList<String>();

    static {
        File file = new File(Statics.FILE_NAME);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            reader.lines().forEach(line -> {
                lines.add(line);
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
