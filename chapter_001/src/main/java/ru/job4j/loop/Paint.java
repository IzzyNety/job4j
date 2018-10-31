package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Ilya Astafiev (mailto:izzy.nety@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Paint {

    /**
     * Правая сторона пирамиды
     *
     * @param height
     * @return
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Левая сторона пирамиды
     *
     * @param height
     * @return
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * Обьединение пирамиды.
     */
    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
