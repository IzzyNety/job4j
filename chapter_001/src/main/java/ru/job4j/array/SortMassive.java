package ru.job4j.array;

/**
 * @author Ilya Astafiev (Izzy.nety@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class SortMassive {
    /**
     * метод проверяет отсортирован ли масив.
     *
     * @param array массив
     * @return ответ.
     */
    public boolean isSort(int[] array) {
        boolean result = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[0] > array[i + 1]) {
                result = false;
                break;
            }

        }

        return result;
    }
}
