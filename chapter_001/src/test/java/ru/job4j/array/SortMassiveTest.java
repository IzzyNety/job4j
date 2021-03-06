package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ilya Astafiev (izzy.nety@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SortMassiveTest {
    /**
     * тест на массив где не нужна сортировка
     */
    @Test
    public void whenSortArrayGood() {
        SortMassive sortMassive = new SortMassive();
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        boolean result = sortMassive.isSort(input);
        assertThat(result, is(true));
    }

    /**
     * тест где необходима сортировка
     */
    @Test
    public void whenSortArrayBad() {
        SortMassive sortMassive = new SortMassive();
        int[] input = new int[]{2, 5, 1, 6, 4, 3};
        boolean result = sortMassive.isSort(input);
        assertThat(result, is(false));
    }
}
