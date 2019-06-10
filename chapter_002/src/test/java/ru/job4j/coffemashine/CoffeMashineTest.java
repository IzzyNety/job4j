package ru.job4j.coffemashine;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CoffeMashineTest {

    @Test
    public void when50coffe35Then10and5() {
        CoffeMashine coffeMashine = new CoffeMashine();
        int[] result = coffeMashine.changes(50, 35);
        int[] expected = {10, 5};
        assertThat(result, is(expected));
    }
    @Test
    public void when100coffe35Then65() {
        CoffeMashine coffeMashine = new CoffeMashine();
        int[] result = coffeMashine.changes(100, 35);
        int[] expected = {10, 10, 10, 10, 10, 10, 5,};
        assertThat(result, is(expected));
    }
}
