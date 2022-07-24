package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        int tmp = 0;
        for (char value : string) {
            if (c == value) {
                tmp++;
            }
            if (tmp == number) {
                break;
            }
        }
        int tmp1 = 0;
        for (int index = 0; index < string.length; index++) {

            if (string[index] == c) {
                tmp1++;
                if (tmp1 == tmp) {
                    rsl = index;
                    break;
                }

            }
        }
        return rsl;

    }

    public static void main(String[] args) {
        String num1= "adghetty";
        String num = "abcdec";
        char[] word = num.toCharArray();
        System.out.println(indexOf(word, 'c', 1));
    }
}
