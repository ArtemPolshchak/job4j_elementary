package javarush.eighteen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Английские буквы

В метод main первым параметром приходит путь к файлу.
Посчитать количество символов в файле, которые соответствуют буквам английского алфавита.
Вывести на экран число (количество символов).
Закрыть потоки.

Требования:
•	Считывать с консоли ничего не нужно.
•	Создай поток чтения из файла, который приходит первым параметром в main.
•	В файле необходимо посчитать количество символов, которые соответствуют
буквам английского алфавита, и вывести это число в консоль.
•	Нужно учитывать заглавные и строчные буквы.

*/

public class AlphabetCount {
    public static void main(String[] args) throws Exception {
        int count = 0;
        char o = 'g';

        if (args.length == 0) {
            return;
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            while (fileReader.ready()) {
              o = (char) fileReader.read();
              String s = o + "";
                Pattern patlatletter = Pattern.compile("[a-zA-Z]{1}");
                Matcher matcher = patlatletter.matcher(s);
                if (matcher.matches()) {
                        count ++;
                }
            }
        }
        System.out.println(count);
    }
}
