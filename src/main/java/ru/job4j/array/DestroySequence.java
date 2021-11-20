package ru.job4j.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        int mas = seq.length - 5;
        for (int i = 0; i < 5; i++) {
            seq[i] = '0';
            seq[mas++] = '1';
        }
        return seq;
    }

    public static void main(String[] args) {
        System.out.println(destroy("1111100000".toCharArray()));
        System.out.println(destroy("66666666666666666666666666666".toCharArray()));
        System.out.println(destroy("11111700000".toCharArray()));
    }
}
