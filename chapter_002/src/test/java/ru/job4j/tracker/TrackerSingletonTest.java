package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingletonTest {

    @Test
    public void whenUseTrackerSingleEnum() {
        TrackerSingleEnum singleEnum1 = TrackerSingleEnum.INSTANCE;
        TrackerSingleEnum singleEnum2 = TrackerSingleEnum.INSTANCE;
        assertThat(singleEnum1 == singleEnum2, is(true));
    }

    @Test
    public void whenUseTrackerSingleStaticLazy() {
        TrackerSingleStaticLazy staticLazy1 = TrackerSingleStaticLazy.getInstance();
        TrackerSingleStaticLazy staticLazy2 = TrackerSingleStaticLazy.getInstance();
        assertThat(staticLazy1 == staticLazy2, is(true));
    }

    @Test
    public void whenUseTrackerSingleEager() {
        TrackerSingleEager singleEager1 = TrackerSingleEager.getInstance();
        TrackerSingleEager singleEager2 = TrackerSingleEager.getInstance();
        assertThat(singleEager1 == singleEager2, is(true));
    }

    @Test
    public void whenUseTrackerSinglePrivateLazy() {
        TrackerSinglePrivateLazy privateLazy1 = TrackerSinglePrivateLazy.getInstance();
        TrackerSinglePrivateLazy privateLazy2 = TrackerSinglePrivateLazy.getInstance();
        assertThat(privateLazy1 == privateLazy2, is(true));
    }
}
