package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        int tmp = 0;
        for (char value : string) {
            if (c == value) {
                tmp++;
            }
        }
        for (int index = 0; index < string.length; index++) {

            if (string[index] == c && number == tmp) {
                rsl = index;
            }
        }
        return rsl;

    }

    public static void main(String[] args) {
        String num = "adghetty";
        char[] word = num.toCharArray();
        System.out.println(indexOf(word, 't', 2));
    }
}
