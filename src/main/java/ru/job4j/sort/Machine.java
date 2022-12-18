package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    private final int[] couns = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int moneyChange = money - price;
        for (int coin : couns) {
            while (moneyChange > 0 && moneyChange >= coin) {
                moneyChange -= coin;
                rsl[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
