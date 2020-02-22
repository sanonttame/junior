package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int sizeCoins = 0;
        int surrender = money - price;
        while (surrender - coins[sizeCoins] >= 0) {
            rsl[size] = coins[sizeCoins];
            surrender = surrender - coins[sizeCoins];
            size++;
            if (surrender - coins[sizeCoins] < 0) {
                sizeCoins++;
                if (sizeCoins == 4) {
                    break;
                }
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}