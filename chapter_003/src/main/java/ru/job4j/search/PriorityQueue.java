package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int i = tasks.size();
        for (int index = 0; index < tasks.size(); index++) {
            if (task.getPriority() < tasks.get(index).getPriority()) {
                i = index;
                break;
            }
        }
        tasks.add(i, task);
    }

    public Task take() {
        return this.tasks.poll();
    }
}
