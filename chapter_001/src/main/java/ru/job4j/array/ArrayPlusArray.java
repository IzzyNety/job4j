package ru.job4j.array;

/**
 * Объединение двух массивов и последующая сортировка
 */

public class ArrayPlusArray {
    public int[] plusArray(int[] array1, int[] array2){
        int[] array3 = new int[array1.length + array2.length];
            for (int i = 0; i < array3.length; i++)
                for (int j = 0; j < i; j++) {
                    if (array3[j] > array3[j + 1]) {
                        int tpm = array3[j];
                        array3[j] = array3[j + 1];
                        array3[j + 1] = tpm;
                    }
                }
        return array3;
    }
}
