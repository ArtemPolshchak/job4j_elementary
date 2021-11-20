package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        int sizeOfChar = string.length;
        char[] res = new char[sizeOfChar];
        for (int i = 0; i < sizeOfChar; i++) {

            char one = Character.toUpperCase(string[i]);
            res[i] = one;
        }
        return res;
    }
}

