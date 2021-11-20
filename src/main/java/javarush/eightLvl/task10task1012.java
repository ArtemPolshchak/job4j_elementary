package javarush.eightLvl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.
 *
 * Пример вывода:
 * а 5
 * б 8
 * в 3
 * г 7
 * д 0
 * ...
 * я 9
 */
public class task10task1012 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char c : abcArray) {
            alphabet.add(c);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character,Integer> map = new TreeMap<Character,Integer>();
        for (Character x:alphabet) {
            map.put(x, 0);
        }

        //Iterator<Map.Entry<Character,Integer>> iter = map.entrySet().iterator();

        for (String s : list) {
            for (char ch : s.toCharArray()) {
                for (Map.Entry<Character, Integer> pair : map.entrySet()) {
                    if (pair.getKey().equals(ch)) {
                        map.put(pair.getKey(), pair.getValue() + 1);
                    }
                }
            }
        }

        for (Character c : alphabet) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    if (entry.getKey().equals(c)) {
                        System.out.println(c + " " + entry.getValue());
                }

            }
        }
    }
}
