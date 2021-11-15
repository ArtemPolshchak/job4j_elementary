package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < words.length; index++) {
            if (index == words.length - 1) {
                result.append(words[index]);
            } else {
                result.append(words[index]).append(" ");
            }
        }
        return result.toString();
    }
}
