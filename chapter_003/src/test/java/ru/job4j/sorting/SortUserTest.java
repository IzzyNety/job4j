package ru.job4j.sorting;

import org.junit.Test;
import ru.job4j.generalization.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortUserTest {
    @Test
    public void whenSortedUserByAge() {
        SortUser sortUser = new SortUser();
        List<User> list = new ArrayList<>();
        list.add(new User(1, "Vasya", "Moskva", 53));
        list.add(new User(2, "Petr", "Vladimir", 26));
        list.add(new User(3, "Zina", "Myrmansk", 34));
        list.add(new User(4, "Vasya", "Kirov", 64));
        Set<User> result = sortUser.sort(list);
        assertThat(result.iterator().next().getAge(), is(26));
    }

    @Test
    public void sortNameLength() {
        User user1 = new User(1, "Сергей", "Воронеж", 25);
        User user2 = new User(2, "Иван", "Мурманск", 30);
        User user3 = new User(3, "Сергей", "Воронеж", 20);
        User user4 = new User(4, "Иван", "Воронеж", 25);
        List<User> expected = new ArrayList<>(Arrays.asList(
                user2, user4, user1, user3
        ));
        assertThat(expected, is(new SortUser().sortNameLength(Arrays.asList(user1, user2, user3, user4))));
    }

    @Test
    public void sortByAllFields() {
        User user1 = new User(1, "Сергей", "Воронеж", 25);
        User user2 = new User(2, "Иван", "Мурманск", 30);
        User user3 = new User(3, "Сергей", "Воронеж", 20);
        User user4 = new User(4, "Иван", "Воронеж", 25);
        List<User> expected = new ArrayList<>(Arrays.asList(
                user4, user2, user3, user1
        ));
        assertThat(expected, is(new SortUser().sortByAllFields(Arrays.asList(user1, user2, user3, user4))));
    }
}
