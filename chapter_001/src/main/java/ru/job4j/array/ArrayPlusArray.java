package ru.job4j.array;

/**
 * Объединение двух массивов в третий и последующая сортировка
 */

public class ArrayPlusArray {
    public int[] plusArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
            for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[i];
            }
                for (int i = 0; i < array2.length; i++) {
                    array3[i + array1.length] = array2[i];
                }
                BubbleSort sort = new BubbleSort();
                sort.sort(array3);
                return array3;
    }
}
