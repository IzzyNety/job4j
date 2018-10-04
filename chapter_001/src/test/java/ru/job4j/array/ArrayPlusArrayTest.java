package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayPlusArrayTest {
    /**
     * тест на сложение двух массивов в третий и последующей сортировки
     */
    @Test
    public void whenOneArrayPlusTwoArrayThenSortArray() {
        ArrayPlusArray arrayPlusArray = new ArrayPlusArray();
        int[] input = new int[]{1, 2, 3};
        int[] input2 = new int[]{4, 5, 6};
        int[] result = arrayPlusArray.plusArray(input, input2);
        int[] expect = new  int[]{1, 2, 3, 4, 5, 6};
        assertThat(result, is(expect));
    }
    @Test
    public void whenOneArrayHaveThreeAndPlusArrayHaveFive() {
        ArrayPlusArray arrayPlusArray = new ArrayPlusArray();
        int[] input = new int[]{1, 4, 6};
        int[] input2 = new int[]{2, 3, 5, 7, 11};
        int[] result = arrayPlusArray.plusArray(input, input2);
        int[] expect = new int[]{1, 2, 3, 4, 5, 6, 7, 11};
        assertThat(result, is(expect));
    }
    @Test
    public void whenOneArrayHaveFiveAndPlusArrayHavethree() {
        ArrayPlusArray arrayPlusArray = new ArrayPlusArray();
        int[] input = new int[]{2, 3, 5, 7, 11};
        int[] input2 = new int[]{1, 4, 6};
        int[] result = arrayPlusArray.plusArray(input, input2);
        int[] expect = new int[]{1, 2, 3, 4, 5, 6, 7, 11};
        assertThat(result, is(expect));
    }
    @Test
    public void whenOneArrayHaveNullAndPlusArrayHaveThree() {
        ArrayPlusArray arrayPlusArray = new ArrayPlusArray();
        int[] input = new int[]{};
        int[] input2 = new int[]{1, 3, 5};
        int[] result = arrayPlusArray.plusArray(input, input2);
        int[] expect = new int[]{1, 3, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHaveThreeAndPlusArrayHaveNull() {
        ArrayPlusArray arrayPlusArray = new ArrayPlusArray();
        int[] input = new int[]{1, 3, 5};
        int[] input2 = new int[]{};
        int[] result = arrayPlusArray.plusArray(input, input2);
        int[] expect = new int[]{1, 3, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHaveNullAndPlusArrayHaveNull() {
        ArrayPlusArray arrayPlusArray = new ArrayPlusArray();
        int[] input = new int[]{};
        int[] input2 = new int[]{};
        int[] result = arrayPlusArray.plusArray(input, input2);
        int[] expect = new int[]{};
        assertThat(result, is(expect));
    }
}
