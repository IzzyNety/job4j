package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс, считывающий ввод пользователя.
 */


public class ConsoleInput implements Input {
    /**
     * Создаем объект класса Scanner.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Метод, возвращает ввод пользователя.
     * @param question пункт меню.
     * @return ввод пользователя.
     */
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
