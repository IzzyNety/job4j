package ru.job4j.stategy;

/**
 * Класс Paint выводи информацию в коноль.
 */

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

}
