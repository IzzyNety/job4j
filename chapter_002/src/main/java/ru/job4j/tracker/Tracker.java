package ru.job4j.tracker;

import java.util.*;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
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
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод редактирования заявок.
     */
    public boolean replace(String id, Item item) {
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
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
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
    protected Item[] findByName(String key) {
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
    protected Item[] findAll() {
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
        return id;
    }
}
