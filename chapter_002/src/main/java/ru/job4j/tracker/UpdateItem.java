package ru.job4j.tracker;

public class UpdateItem implements UserAction {

    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Редактирование заявки --------------");
        String id = input.ask("Введите id заявки : ");
        String name = input.ask("Введите name заявки: ");
        String desc = input.ask("Введите description заявки : ");
        Item item = new Item(name, desc, 222);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка была обновлена");
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
    }

    @Override
    public String info() {
        return "2. Update Item.";
    }
}
