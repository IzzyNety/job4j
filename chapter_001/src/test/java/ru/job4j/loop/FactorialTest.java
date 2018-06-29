package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    /**
     * Тест проверяющий, что факториал числа 5 равен 120
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial chisla = new Factorial();
        final int answer = chisla.calc(5);
        assertThat(120, is(answer));
    }

    /**
     * Тест проверяющий, что факториал числа 0 равен 1.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial one = new Factorial();
        final int answer = one.calc(0);
        assertThat(1, is(answer));

    }
}
