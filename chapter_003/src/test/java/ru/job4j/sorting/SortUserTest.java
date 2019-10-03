package ru.job4j.sorting;

import org.junit.Test;
import ru.job4j.generalization.User;

import java.util.ArrayList;
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
}
