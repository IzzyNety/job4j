package ru.job4j.array;

/**
 * Объединение двух массивов в третий по возрастанию
 */

public class ArrayPlusArray {
    public int[] plusArray(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0, j = 0;
        for (int k = 0; k < result.length; k++) {
            if (i > first.length - 1) {
                result[k] = second[j++];

            } else if (j > second.length - 1) {
                result[k] = first[i++];

            } else if (first[i] < second[j]) {
                result[k] = first[i++];
            } else {
                result[k] = second[j++];
            }
        }

                return result;
    }
}
