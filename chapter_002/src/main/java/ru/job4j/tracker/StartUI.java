package ru.job4j.tracker;

/**
 * этот класс должен запускать программу и обеспечивать полноценную работу всего приложения.
 */
public class StartUI {

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
           menu.select(Integer.valueOf(input.ask("select: ")));
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
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}