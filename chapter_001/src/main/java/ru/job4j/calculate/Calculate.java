package ru.job4j.calculate;

/**
 * Конструктор, вывод строки на консоль.
 *
 * @author Astaafiev Ilya (izzy.nety@gmail.com).
 * @version $ID$.
 * @since 29.05.2018.
 */

public class Calculate {
    /**
     * Main.
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /**
     * Method echo.
     *
     * @param name My name.
     * @return Echo plus my name.
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}
