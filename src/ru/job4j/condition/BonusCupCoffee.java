package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int cntOfCups = count;
        int result;
        int cnt = 0;
        while (cntOfCups >= 0) {
            cntOfCups = cntOfCups - n;
            cnt++;
            if (cntOfCups <= 0) {
                cnt--;
            }
        }
        result = count + cnt;

        return result;
    }
}
