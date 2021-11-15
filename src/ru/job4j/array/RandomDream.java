package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String res;
        int resultNum;
            if (num <= prizes.length) {
               res = prizes[num - 1];
            } else {
                if (num % prizes.length != 0) {
                    resultNum = num % prizes.length;

                } else {
                    resultNum = prizes.length;
                }
                res = prizes[resultNum - 1];
            }
        return res;
    }
}
