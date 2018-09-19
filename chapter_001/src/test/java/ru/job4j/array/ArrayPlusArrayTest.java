package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayPlusArrayTest {
    /**
     * тест на сложение двух массивов и последующей сортировки
     */
    @Test
    public void whenOneArrayPlusTwoArrayThenSortArray(){
        ArrayPlusArray arrayPlusArray = new ArrayPlusArray();
        int[] input = new int[]{1, 5, 4};
        int[] input2 = new int[]{2, 3, 6};
        int[] result = arrayPlusArray.plusArray(input,input2);
        int[] expect = new  int[]{1,2,3,4,5,6};
        assertThat(result, is(expect));
    }
}
