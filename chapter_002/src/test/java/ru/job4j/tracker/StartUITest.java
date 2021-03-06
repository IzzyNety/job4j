package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.tracker.StartUI.showMenu;

public class StartUITest {

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    /**
     * Тест на добавление пользователем заявки.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll(), is("test name"));
    }

    /**
     * Тест на изменение заявки пользователем.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdateValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", 222));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    /**
     * Тест на удаление заявки пользователем.
     */
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test name1", "desc1", 123L));
        Item item2 = tracker.add(new Item("test name2", "desc2", 1234L));
        Item item3 = tracker.add(new Item("test name3", "desc3", 1234L));
        Input input = new StubInput(new String[]{"3", item2.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(showMenu())
                                .append(System.lineSeparator())
                                .append("------------ Удаление заявки --------------")
                                .append(System.lineSeparator())
                                .append("Заявка была удалена")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    /**
     * Тест на вывод всех заявок.
     */
    @Test
    public void whenSHowAllItems() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test name1", "desc1", 123L));
        Item item2 = tracker.add(new Item("test name2", "desc2", 1234L));
        Item item3 = tracker.add(new Item("test name3", "desc3", 1234L));
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(showMenu())
                                .append(System.lineSeparator())
                                .append("------------ Вывод всех заявок --------------")
                                .append(System.lineSeparator())
                                .append(item1.toString())
                                .append(System.lineSeparator())
                                .append(item2.toString())
                                .append(System.lineSeparator())
                                .append(item3.toString())
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    /**
     * Тест на поиск по ID.
     */
    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test name1", "desc1", 123));
        Item item2 = tracker.add(new Item("test name2", "desc2", 1234));
        Item item3 = tracker.add(new Item("test name3", "desc3", 12345));
        Input input = new StubInput(new String[]{"4", item2.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(showMenu())
                                .append(System.lineSeparator())
                                .append("------------ Поиск по ID --------------")
                                .append(System.lineSeparator())
                                .append("Заявка с id - " + item2.getId() + " : " + item2.getId())
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

    /**
     * Тест на поиск по имени.
     */
    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test name1", "desc1", 123L));
        Item item2 = tracker.add(new Item("test name2", "desc2", 1234L));
        Item item3 = tracker.add(new Item("test name3", "desc3", 1234L));
        Input input = new StubInput(new String[]{"5", item2.getName(), "6"});
        new StartUI(input, tracker).init();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append(showMenu())
                                .append(System.lineSeparator())
                                .append("------------ Поиск по имени --------------")
                                .append(System.lineSeparator())
                                .append(item2.getName())
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }

}
