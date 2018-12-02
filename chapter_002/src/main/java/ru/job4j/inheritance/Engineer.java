package ru.job4j.inheritance;

public class Engineer extends Profession {
    void build(House house) {
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        House house = new House();

        engineer.build(house);
    }
}
