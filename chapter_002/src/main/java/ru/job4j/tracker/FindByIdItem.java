package ru.job4j.tracker;

public class FindByIdItem implements UserAction {

    @Override
    public int key() {
        return 4;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск по ID --------------");
        String id = input.ask("Введите id заявки : ");
        Item item = tracker.findById(id);
        if (tracker.findById(id) != null) {
            System.out.println("Заявка с id - " + id + " : " + item.getId());
        } else {
            System.out.println("Заявка по id не найдена");
        }
    }

    @Override
    public String info() {
        return "4. Find by id Item.";
    }
}
