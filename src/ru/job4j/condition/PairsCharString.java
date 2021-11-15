package ru.job4j.condition;

public class PairsCharString {

    public static boolean check(String l, String r) {
        char[] lArray = l.toCharArray();
        char[] rArray = r.toCharArray();
        if (l.equals("") && r.equals("")) {
            return true;
        }
        for (int i = 0; i < lArray.length; i++) {
            if (lArray[0] == rArray[rArray.length - 1] && rArray[0] == lArray[lArray.length - 1]) {
                return true;
            }
        }

        return false;

    }
}