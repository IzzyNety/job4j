package ru.job4j.array;

/**
 * метод проверяет, что все элементы в массиве являются true или false.
 */
public class Check {
    public boolean mono(boolean[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
                return false;
            }
        }
        return true;
    }
}
