package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter sum = new Counter();
        final int answer = sum.add(0, 10);
        assertThat(30, is(answer));
    }
}
