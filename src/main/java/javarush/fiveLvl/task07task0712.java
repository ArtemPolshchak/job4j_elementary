package javarush.fiveLvl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class task07task0712 {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String> list = new ArrayList<>();
       String minWord = "";
       String maxWord = "";
       int sizeWords = 0;

       
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);

        }
        for (String s : list) {
            if (s.length() > sizeWords) {
                maxWord = s;
            }
            sizeWords = maxWord.length();
        }
        for (String s : list) {
            if (s.length() < sizeWords) {
                minWord = s;
            }
            sizeWords = minWord.length();
        }

        for (String s : list) {
            if (maxWord.equals(s)) {
                System.out.println(maxWord);
                break;
            } else if (minWord.equals(s)) {
                System.out.println(minWord);
                break;
            }
        }
    }
}

