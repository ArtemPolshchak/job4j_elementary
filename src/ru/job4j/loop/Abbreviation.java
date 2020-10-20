package ru.job4j.loop;

import java.io.BufferedReader;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder str = new StringBuilder();
        String[] subStr;
        String delimiter = " ";
        subStr = s.split(delimiter);
        for (String value : subStr) {
            str.append(value.charAt(0));
        }
        return str.toString();
    }
}
