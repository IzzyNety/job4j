package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        for (int index = start; index <= finish; index++) {
            if (index % 2 <= 0) {
                start += index;
            }
        }
        return start;
    }
}
