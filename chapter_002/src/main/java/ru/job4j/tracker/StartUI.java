package ru.job4j.tracker;

/**
 * этот класс должен запускать программу и обеспечивать полноценную работу всего приложения.
 */
public class StartUI {

    public static void main(String[] args) {

        int selection = 0;

        do {
            System.out.println("[1] Add new Item");
            System.out.println("[2] Show all items");
            System.out.println("[3] Edit item");
            System.out.println("[4] Delete item");
            System.out.println("[5] Find item by Id");
            System.out.println("[6] Find items by name");
            System.out.println("[7] Exit Program");

            System.out.println("Insert selection: ");
            selection = ConsoleInput.nextInt();

            switch (selection) {
                case 1:
                    ConsoleInput.addNewItem();
                    break;
                case 2:
                    ConsoleInput.showAllItems();
                    break;
                case 3:
                    ConsoleInput.editItem();
                    break;
                case 4:
                    ConsoleInput.deleteItem();
                    break;
                case 5:
                    ConsoleInput.findById();
                    break;
                case 6:
                    ConsoleInput.findItemByName();
                    break;
                case 7:
                    System.out.println("------------");
                    break;
                default:
                    System.out.println("The selection is invalid.");
                    break;
            }
        }
        while (selection != 7) ;

    }
}
