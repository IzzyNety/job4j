package ru.job4j.tracker;

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
        final Item[] all = tracker.findAll();
        if (all.length > 0) {
            for (Item item : all) {
                System.out.println(item);
            }
        } else {
            System.out.println("Трекер пуст");
        }
    }

    //   @Override
//    public String info() {
    //       return "1. Find all Item.";
//    }
}
