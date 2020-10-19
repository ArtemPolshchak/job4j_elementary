package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder str = new StringBuilder(s);
        if (s.isEmpty()) {
            return "empty";
        } else if (str.length() < 4) {
            return str.toString();
        } else {
            for (int i = str.length() - 5; i >= 0; i--) {
                str.setCharAt(i, '#');
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(code("1231234543"));
    }
}