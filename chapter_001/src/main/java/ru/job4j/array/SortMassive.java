package ru.job4j.array;

/**
 * @author Ilya Astafiev (Izzy.nety@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class SortMassive {
    /**
     *  метод проверяет отсортирован ли масив.
     * @param array массив
     * @return  ответ.
     */
    public int[] isSort(int[] array) {
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
