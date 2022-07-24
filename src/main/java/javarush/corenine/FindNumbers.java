package javarush.corenine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Замена чисел
*/

public class FindNumbers {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader("D:/1.txt"));

        while (fileReader.ready()) {
            String s = fileReader.readLine();
            Pattern pattern = Pattern.compile("\\b[0-9]{1,2}\\b");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                String stringNum = matcher.group();
                int tmp = Integer.parseInt(stringNum);
                if (map.containsKey(tmp)) {
                    String str = map.get(tmp);
                    s = s.replaceAll("\\b" + stringNum + "\\b", str);
                }
            }
            System.out.println(s);
        }

        fileReader.close();
        reader.close();
    }
}



