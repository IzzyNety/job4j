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
}
