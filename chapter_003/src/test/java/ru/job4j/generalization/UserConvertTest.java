package ru.job4j.generalization;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
    @Test
    public void when4UsersStayInMap() {
        UserConvert users = new UserConvert();
        List<User> list = new ArrayList<>();

        list.add(new User(1, "Vasya", "Vlodomir", 16));
        list.add(new User(2, "Ilya", "Ekaterinburg", 18));
        list.add(new User(3, "Petr", "Kazan'", 32));
        list.add(new User(4, "Sasha", "Murmansk", 88));

        HashMap<Integer, User> result = users.process(list);
        String test = result.get(3).city;
        String expect = "Kazan'";
        assertThat(test, is(expect));
    }
}
