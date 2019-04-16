package ru.job4j.tracker;

public class ExitProgram extends BaseAction {
    public ExitProgram(int key, String name) {
        super(key, name);

//    @Override
 //   public int key() {
 //       return 6;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.exit(0);
    }

//    @Override
//    public String info() {
//        return "6. Exit program.";
//    }
}
