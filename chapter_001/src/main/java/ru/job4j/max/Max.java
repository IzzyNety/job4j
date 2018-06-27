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
        return first < second ? second : first;
    }

    /**
     * максимум из трех чисел.
     * @param first - первое число.
     * @param second - второе число.
     * @param third - третье число.
     * @return возвращает параметр.
     */
    public int max(int first, int second, int third){
        int maximum = this.summation(first, second);
        return this.summation(maximum, third);

    }
}
