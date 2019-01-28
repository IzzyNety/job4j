package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    //Тест для замены заявки
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    // Тест по поиску имени
    @Test
    public void whenFindNameThenReturnInArray() {
        Tracker tracker = new Tracker();
        Item firstItem = new Item("test1", "testDescription1", 123L);
        tracker.add(firstItem);
        Item secondItem = new Item("test1", "testDescription2", 1234L);
        tracker.add(secondItem);
        Item thirdItem = new Item("test", "testDescription3", 1235L);
        tracker.add(thirdItem);
        Item[] expected = {firstItem, secondItem};
        assertThat((tracker.findByName("test1")), is(expected));
    }

    //Тест по поиску по id
    @Test
    public void whenFindIdThenReturnInArray() {
        Tracker tracker = new Tracker();
        Item item = new Item("Test1", "testDescription1", 123L);
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }

    //Тест на получение заявки
    @Test
    public void whenAddItemThenLookTHisItem() {
        Tracker tracker = new Tracker();
        Item firstItem = new Item("Test1", "testDescription1", 123L);
        tracker.add(firstItem);
        Item secondItem = new Item("test1", "testDescription2", 1234L);
        tracker.add(secondItem);
        Item[] expected = {firstItem, secondItem};
        assertThat((tracker.findAll()), is(expected));
    }

    //Тест на удаление элемента
    @Test
    public void whenDelFirstElementThenLookAllWithOutFirstElement() {
        Tracker tracker = new Tracker();
        Item firstItem = new Item("test1", "testDescription1", 123L);
        tracker.add(firstItem);
        Item secondItem = new Item("test2", "testDescription2", 1234L);
        tracker.add(secondItem);
        Item[] expected = {secondItem, null};
        tracker.delete(firstItem.getId());
        assertThat(tracker.findAll(), is(expected));
    }

}
