package ru.job4j.sorting;

import ru.job4j.generalization.User;

import java.util.*;

public class SortUser {
    public Set<User> sort(List<User> list) {
        return new TreeSet<>(list);
    }

    public List<User> sortNameLength(List<User> list) {
        List<User> result = new ArrayList<>(list);
        Collections.sort(result, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        return result;
    }

    public List<User> sortByAllFields(List<User> list) {
        List<User> result = new ArrayList<>(list);
        Collections.sort(result, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int result = o1.getName().compareTo(o2.getName());
                result = result == 0 ? o1.getAge() - o2.getAge() : result;
                return result;
            }
        });
        return result;
    }
}
