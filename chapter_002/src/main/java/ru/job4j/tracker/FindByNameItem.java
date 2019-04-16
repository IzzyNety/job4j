package ru.job4j.tracker;

public class FindByNameItem extends BaseAction {
    public FindByNameItem(int key, String name) {
        super(key, name);

//    @Override
//    public int key() {
//        return 5;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск по имени --------------");
        String name = input.ask("Введите имя заявки : ");
        Item[] items = tracker.findByName(name);
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }

//    @Override
//    public String info() {
//        return "5. Find by name Item.";
//    }
}
