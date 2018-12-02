package ru.job4j.inheritance;

public class Patient extends Doctor {
    public String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
