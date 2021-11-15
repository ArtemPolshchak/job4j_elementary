package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String number = Integer.toString(i);
        StringBuilder str = new StringBuilder(number);
        int num = str.length() - 1;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) != str.charAt(num)) {
                return false;
            }
            num--;
        }
        return true;
    }
}
