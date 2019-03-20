package ru.job4j.stategy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is (
                        new StringBuilder()
                            .append("++++")
                            .append("+  +")
                            .append("+  +")
                            .append("++++")
                            .toString()
                )
        );
    }
}
