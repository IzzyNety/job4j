package ru.job4j.tracker;

public class DeleteItem extends BaseAction {
    public DeleteItem(int key, String name) {
        super(key, name);

        //   @Override
//    public int key() {
        //       return 3;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Удаление заявки --------------");
        String id = input.ask("Введите id заявки : ");
        if (tracker.delete(id)) {
            System.out.println("Заявка была удалена");
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
    }

    //   @Override
    //   public String info() {
    //       return "3. Delete Item.";
//    }
}
