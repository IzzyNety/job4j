package ru.job4j.tracker;

public enum TrackerSingleEnum {
    INSTANCE; //перечисления.

    //Конструкторы и методы.
    public Item add(Item model) {
        return model;
    }
}
