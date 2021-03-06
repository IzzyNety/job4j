package ru.job4j.array;

/**
 * @author Ilya Astafiev (izzy.nety@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {
    /**
     * Поиск элемента в массиве.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
