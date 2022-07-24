package javarush.parserurl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Artem Polshchak on 30.12.2021.
 * @project JavaRush  Парсер реквестов
 * Java Core
 * 5 уровень, 12 лекция
 * Для решения этой задачи тебе нужно:
 * Считать с консоли URL-ссылку.
 * Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &, например, lvl=15).
 * URL содержит минимум 1 параметр.
 * Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
 * Если присутствует параметр obj, то передать его значение в нужный метод alert():
 * alert(double value) - для чисел (не забывай о том, что число может быть дробным);
 * alert(String value) - для строк.
 * Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.
 * Пример 1
 *
 * Ввод:
 * http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
 *
 * Вывод:
 * lvl view name
 *
 * Пример 2
 *
 * Ввод:
 * http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
 *
 * Вывод:
 * obj name
 * double: 3.14
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        String res = url.split("\\?")[1];
        String objName = "";
        String[] param = res.split("&");
        for (String s : param) {
            String tmp = s.split("=")[0];
            System.out.println(tmp);
            if (tmp.equals("obj")) {
                objName = s.split("=")[1];
            }
        }

        try  {
            alert(Double.parseDouble(objName));
        } catch (Exception e) {
            if (objName.isEmpty()) {
                return;
            }
            alert(objName);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
