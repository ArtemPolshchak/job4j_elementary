package ru.job4j.loop;

import static java.lang.StrictMath.sqrt;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number < 2) {
            prime = false;
        }

        for (int i = 1; i <= number; i++) {
             if ((number % 2) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
