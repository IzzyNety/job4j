package ru.job4j.tracker;

public class AddItem extends BaseAction {
    public AddItem(int key, String name) {
        super(key, name);
        //  @Override
        //   public int key() {
//        return 0;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Adding new item --------------");
        String name = input.ask("Please, provide item name:");
        String desc = input.ask("Please, provide item description:");
        long timeNow = System.currentTimeMillis();
        Item item = new Item(name, desc, timeNow);
        tracker.add(item);
        System.out.println("------------ New Item with Id : " + item.getId());
        System.out.println("------------ New Item with Name : " + item.getName());
        System.out.println("------------ New Item with Description : " + item.getDescription());
    }

    //   @Override
    //   public String info() {
    //       return "0. Add new Item.";
//    }
}
