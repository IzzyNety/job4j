package ru.job4j.tracker;

import java.util.List;

public class FindAllItem extends BaseAction {
    public FindAllItem(int key, String name) {
        super(key, name);
    }

//    @Override
//    public int key() {
//        return 1;
//    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Вывод всех заявок --------------");
        List<Item> all = tracker.findAll();

            for (Item item : all) {
                System.out.println(item);
            }

    }

    //   @Override
//    public String info() {
    //       return "1. Find all Item.";
//    }
}
