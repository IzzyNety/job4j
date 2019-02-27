package ru.job4j.tracker;

/**
 * Интерфейс, для считывания ввода пользователя.
 */

public interface Input {
    /**
     * Метод, для ввода данных пользователем.
     * @param question пункт меню.
     * @return ввод пользователя.
     */

    String ask(String question);

}
