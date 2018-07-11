package ru.job4j.array;

/**
 * метод проверяет, что все элементы в массиве являются true или false.
 */
public class Check {
    public boolean mono(boolean[] data) {
            boolean result = false;
            for (int i = 0; i < data.length; i++) {
                if (data[i] == false) {
                    return false;
                } else {
                    return true;
                }

            }
            return result;
    }
}
