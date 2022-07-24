package javarush.five;

import java.util.ArrayList;
import java.util.ListIterator;

/*
Р или Л
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза

Выходные данные:
лира
лоза
лоза
*/

public class ParseLetters {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("конь");
        strings.add("бомба");
        strings.add("ларек");
        strings.add("рок");
        strings.add("лава");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ListIterator<String> iterator = strings.listIterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.contains("р") && str.contains("л")) {
                continue;
            } else if (str.contains("р")) {
                iterator.remove();
            } else if (str.contains("л")) {
                iterator.add(str);
            }
        }
        return strings;
    }
}
