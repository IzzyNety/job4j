package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Этот класс используется для ввода пользовательских данных из консоли.
 */


public class ConsoleInput {
    private String id;
    private String name;
    private String description;
    private long create;

    public ConsoleInput(String id, String name, String description, long create) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public long getCreate() {
        return this.create;
    }

    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    private static final Random RN = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item addNewItem(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод редактирования заявок.
     */
    public boolean editItem(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (item.getId().equals(id)) {
                this.items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод удаления заявок
     */
    public boolean deleteItem(String id) {
        boolean result = false;
        for (int i=0; i <position; i++) {
            if (this.items != null && this.items[i].getId().equals(id)) {
                System.arraycopy(items, i + 1, items, i, items.length - (i + 1));
                this.position = this.position - 1;
                result = true;
                break;
            }

        }
        return result;
    }

    /**
     * метод получения заявки по id.
     */
    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * получение заявки по имени.
     */
    protected Item[] findItemByName(String key) {
        int i = 0;
        Item[] result = new Item[position];
        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                result[i] = item;
                i++;
            }
        }
        return Arrays.copyOf(result, i);
    }

    /**
     * Получения списка всех заявок
     */
    protected Item[] showAllItems() {
        Item[] result = new Item[position];
        for (int i = 0; i != this.position; i++) {
            result[i] = this.items[i];
        }
        return result;
    }


    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        String id = String.valueOf(System.currentTimeMillis() + RN.nextInt());
        return id;}

     public static int nextInt(){
         Scanner keyboard = new Scanner(System.in);
         int i = keyboard.nextInt();
         return i;
     }
}
