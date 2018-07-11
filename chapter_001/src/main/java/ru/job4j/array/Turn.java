package ru.job4j.array;

/**
 * переворачивание массива
 */
public class Turn {
    public int[] turn(int[] array) {
        int tpm = 0;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            tpm = array[i];
            array[i] = array[j];
            array[j] = tpm;

        }
        return array;
    }
}
