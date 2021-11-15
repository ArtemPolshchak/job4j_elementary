package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int count = 0;

        for (int i = 0; i < left.length(); i++) {
            char crLeft = left.charAt(i);
            char crRight = right.charAt(i);
            if (crLeft != crRight) {
                count++;
            }
        }
        return count;

    }
}
