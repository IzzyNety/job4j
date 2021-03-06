package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MenuTracker {
    /**
     * @param хранит ссылку на обьект.
     */
    private Input input;

    /**
     * @param хранит ссылку на обьект.
     */
    private Tracker tracker;

    /**
     * @param хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<>();

    /**
     * Конструктор
     *
     * @param input   обьект типа Input
     * @param tracker обьект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions() {
        this.actions.add(new AddItem(0, "Add new Item."));
        this.actions.add(new FindAllItem(1, "Find all Item."));
        this.actions.add(new UpdateItem(2, "Update Item."));
        this.actions.add(new DeleteItem(3, "Delete Item."));
        this.actions.add(new FindByIdItem(4, "Find by id Item."));
        this.actions.add(new FindByNameItem(5, "Find by name Item."));
        this.actions.add(new ExitProgram(6, "Exit program."));
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соответствующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * метод вывводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
}
