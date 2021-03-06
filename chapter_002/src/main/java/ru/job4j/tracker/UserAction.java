package ru.job4j.tracker;

public interface UserAction {
    /**
     * Метод возвращает ключ опции.
     *
     * @return ключ.
     */
    int key();

    /**
     * Основной метод.
     *
     * @param input   обьект типа Input
     * @param tracker обьект типа Tracker
     */
    void execute(Input input, Tracker tracker);

    /**
     * Метод возвращает информацию о данном пункте меню.
     *
     * @return Строка меню
     */
    String info();
}
