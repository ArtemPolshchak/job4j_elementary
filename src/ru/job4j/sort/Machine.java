package ru.job4j.sort;
import java.util.Arrays;

public class Machine {
    
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int moneyChange = money - price;
            for (int i = 0; i < COINS.length; i++) {
                while (moneyChange > 0 && moneyChange >= COINS[i]) {
                    moneyChange -= COINS[i];
                    rsl[size] = COINS[i];
                    size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
