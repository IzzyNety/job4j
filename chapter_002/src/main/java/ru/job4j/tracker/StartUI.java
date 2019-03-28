package ru.job4j.tracker;

/**
 * этот класс должен запускать программу и обеспечивать полноценную работу всего приложения.
 */
public class StartUI {
    /**
     * Константа меню для добавление новой заявки.
     */
    private static final String ADD = "0";
    /**
     * Константа меню для показа всех заявок.
     */
    private static final String SHOWALL = "1";
    /**
     * Константа меню для редактирования заявки.
     */
    private static final String EDIT = "2";
    /**
     * Константа меню для удаления заявки.
     */
    private static final String DELETE = "3";
    /**
     * Константа меню для поиска заявки по ID.
     */
    private static final String FINDID = "4";
    /**
     * Константа меню для поиска заявки по имени.
     */
    private static final String FINDNAME = "5";
    /**
     * Константа меню для выходи из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
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
        boolean exit = false;
        while (!exit) {
            System.out.println(showMenu()) ;
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOWALL.equals(answer)) {
                this.findAll();
            } else if (EDIT.equals(answer)) {
                this.edit();
            } else if (DELETE.equals(answer)) {
                this.delete();
            } else if (FINDID.equals(answer)) {
                this.findId();
            } else if (FINDNAME.equals(answer)) {
                this.findName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавление новой заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки : ");
        String desc = this.input.ask("Введите описание заявки : ");
        long timeNow = System.currentTimeMillis();
        Item item = new Item(name, desc, timeNow);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * Метод показа всех заявок.
     */
    private void findAll() {
        System.out.println("------------ Вывод всех заявок --------------");
        final Item[] all = this.tracker.findAll();
        if (all.length > 0) {
            for (Item item : all) {
                System.out.println(item);
            }
        } else {
            System.out.println("Трекер пуст");
        }
    }

    /**
     * Метод редактирования заявки.
     */
    private void edit() {
        System.out.println("------------ Редактирование заявки --------------");
        String id = this.input.ask("Введите id заявки : ");
        String name = this.input.ask("Введите name заявки: ");
        String desc = this.input.ask("Введите description заявки : ");
        Item item = new Item(name, desc, 222);
        if (this.tracker.replace(id, item)) {
            System.out.println("Заявка была обновлена");
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
    }

    /**
     * Метод удаления заявки.
     */
    private void delete() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите id заявки : ");
        if (this.tracker.delete(id)) {
            System.out.println("Заявка была удалена");
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
    }

    /**
     * Метод поиск по ID.
     */
    private void findId() {
        System.out.println("------------ Поиск по ID --------------");
        String id = this.input.ask("Введите id заявки : ");
        Item item = this.tracker.findById(id);
        if (this.tracker.findById(id) != null) {
            System.out.println("Заявка с id - " + id + " : " + item.getId());
        } else {
            System.out.println("Заявка по id не найдена");
        }
    }

    /**
     * Метод поиска по имени.
     */
    private void findName() {
        System.out.println("------------ Поиск по имени --------------");
        String name = this.input.ask("Введите имя заявки : ");
        Item[] items = this.tracker.findByName(name);
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }

    public static StringBuilder showMenu() {
        return new StringBuilder()
                .append(System.lineSeparator())
                .append("Меню.")
                .append(System.lineSeparator())
                .append("0. Add new Item.")
                .append(System.lineSeparator())
                .append("1. Show all items.")
                .append(System.lineSeparator())
                .append("2. Edit item.")
                .append(System.lineSeparator())
                .append("3. Delete item.")
                .append(System.lineSeparator())
                .append("4. Find item by id.")
                .append(System.lineSeparator())
                .append("5. Find items by name.")
                .append(System.lineSeparator())
                .append("6. Exit program.");
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}