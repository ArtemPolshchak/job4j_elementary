package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        if ((number % number) == 0) {
            prime = true;
        }
        return prime;
    }
}
