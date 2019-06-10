package ru.job4j.coffemashine;

import java.util.Arrays;

public class CoffeMashine {
  private int[] COINTS = {10, 5, 2, 1};
       public int[] changes(int value, int price) {

        int change = (value > price) ? value - price : 0;
           int[] result = new int[change];
           int i = 0;
           for (int coin : COINTS) {
               while (change >= coin) {
                   result[i++] = coin;
                   change = change - coin;
               }
           }
           return Arrays.copyOf(result, i);
    }
}
