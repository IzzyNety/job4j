package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> person = new ArrayList<Person>();

    public void add(Person person) {
        this.person.add(person);
    }

    /**
     * Поиск пользователей по ключу key.
     * @param key Ключ поиска.
     * @return Список подошедщих пользхователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (Person person : person) {
            if (person.getAddress().contains(key)
                    || person.getName().contains(key)
                    || person.getPhone().contains(key)
                    || person.getSurname().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}
