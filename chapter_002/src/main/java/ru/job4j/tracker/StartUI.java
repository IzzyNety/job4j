package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * этот класс должен запускать программу и обеспечивать полноценную работу всего приложения.
 */
public class StartUI {

    private int[] ranges = new int[]{0, 1, 2, 3, 4, 5};
    private final Input input;
    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструктор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {

        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основной цикл программы.
     */
    public void init() {

        MenuTracker menu = new MenuTracker(this.input, this.tracker);

        menu.fillActions();

        do {
            menu.show();
            menu.select(input.ask("select:", ranges));
        } while (!"6".equals(this.input.ask("Exit?(y): ")));
    }

    public static StringBuilder showMenu() {
        return new StringBuilder()

                .append("0. Add new Item.")
                .append(System.lineSeparator())
                .append("1. Find all Item.")
                .append(System.lineSeparator())
                .append("2. Update Item.")
                .append(System.lineSeparator())
                .append("3. Delete Item.")
                .append(System.lineSeparator())
                .append("4. Find by id Item.")
                .append(System.lineSeparator())
                .append("5. Find by name Item.")
                .append(System.lineSeparator())
                .append("6. Exit program.");
    }

    public static void main(String[] args) {
        new StartUI(new ValidateInput(), new Tracker()).init();
    }
}