package ru.job4j.array;

/**
 * метод проверяет, что все элементы в массиве являются true или false.
 */
public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
