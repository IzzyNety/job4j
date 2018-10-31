package ru.job4j.loop;

/**
 * Программа вычисляющий факториал.
 */
public class Factorial {
    /**
     * Факториал числа.
     *
     * @param n число.
     * @return расчет факториала.
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
