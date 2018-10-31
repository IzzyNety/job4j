package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    /**
     * тест на нахождение элемента 5 в массиве
     */
    @Test
    public void whenArrayHasLengh5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * тест на нахождения элемента 7 в массиве.
     */
    @Test
    public void whenArrayHasLengh7then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{7, 10, 4};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * тест если элемент не найден
     */
    @Test
    public void whenArrayHasNotLenght7ThenMinysOne() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 12};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
