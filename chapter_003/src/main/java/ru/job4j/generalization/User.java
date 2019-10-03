package ru.job4j.generalization;

import static java.lang.Integer.compare;

public class User implements Comparable<User> {
    int id;
    public String name;
    public int age;
    String city;

    public User(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return id + ", " + name + ", " + city;
    }

    @Override
    public int compareTo(User o) {
        return compare(this.getAge(), o.getAge());
    }
}
