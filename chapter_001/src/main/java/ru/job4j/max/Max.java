package ru.job4j.max;

/**
 * @author Ilya Astafiev (izzy.nety@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Максимум из двух чисел.
     * @param first, second Числа для сравнения.
     * @return Наибольшее число
     */
    public int summation(int first, int second) {
        int max = first < second ? second : first;
        return max;
    }
}
