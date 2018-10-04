package ru.job4j.array;

/**
 * Объединение двух массивов в третий по возрастанию
 */

public class ArrayPlusArray {
    public int[] plusArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int i = 0, j = 0;
        for (int k = 0; k < array3.length; k++) {
            if (i > array1.length - 1) {
                int a = array2[j];
                array3[k] = a;
                j++;
            } else if (j > array2.length - 1) {
                int a = array1[i];
                array3[k] = a;
                i++;
            } else if (array1[i] < array2[j]) {
                int a = array1[i];
                array3[k] = a;
                i++;
            } else {
                int b = array2[j];
                array3[k] = b;
                j++;
            }
        }
  /**          for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[i];
            }
            for (int i = 0; i < array2.length; i++) {
                    array3[i + array1.length] = array2[i];
                }

*/
                return array3;
    }
}
