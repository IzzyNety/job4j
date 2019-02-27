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
     * @param input ввод данных.
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
            this.showMenu();
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
            } else if(EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавление новой заявки в хранилище.
     */
    private void  createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки : ");
        String desc = this.input.ask("Введите описание заявки : ");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * Метод показа всех заявок.
     */
    private void findAll() {
        System.out.println("------------ Вывод всех заявок --------------");
        this.tracker.findAll();
    }

    /**
     * Метод редактирования заявки.
     */
    private void edit() {
        System.out.println("------------ Редактирование заявки --------------");
        String id = this.input.ask("Введите id заявки : ");

        this.tracker.replace();
        System.out.println("------------ Новая заявка с getId : " + findId(id) + "-----------");
    }

    /**
     * Метод удаления заявки.
     */
    private void delete() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите id заявки : ");
        this.tracker.delete(this.tracker.findById(id));
    }

    /**
     * Метод поиск по ID.
     */
    private void findId() {
        System.out.println("------------ Поиск по ID --------------");
        String id = this.input.ask("Введите id заявки : ");
        this.tracker.findById(this.tracker.findById(id));
    }

    /**
     * Метод поиска по имени.
     */
    private void findName() {
        System.out.println("------------ Поиск по имени --------------");
        String name = this.input.ask("Введите имя заявки : ");
        this.tracker.findByName();
    }
    private void showMenu() {
        System.out.println("Меню.");

        int selection = 0;

        do {
            System.out.println("[0] Add new Item");
            System.out.println("[1] Show all items");
            System.out.println("[2] Edit item");
            System.out.println("[3] Delete item");
            System.out.println("[4] Find item by Id");
            System.out.println("[5] Find items by name");
            System.out.println("[6] Exit Program");

            System.out.println("Insert selection: ");


            switch (selection) {
                case 0:
                    createItem();
                    break;
                case 1:
                    findAll();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    findId();
                    break;
                case 5:
                    findName();
                    break;
                case 6:
                    System.out.println("------------");
                    break;
                default:
                    System.out.println("The selection is invalid.");
                    break;
            }
        }
        while (selection != 6) ;

    }
}