package ru.job4j.tracker;

import javax.xml.ws.Holder;

public class TrackerSinglePrivateLazy {
    private TrackerSinglePrivateLazy() {
    }

    public static TrackerSinglePrivateLazy getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSinglePrivateLazy INSTANCE = new TrackerSinglePrivateLazy();
    }

    public static void main(String[] args) {
        TrackerSinglePrivateLazy tracker = TrackerSinglePrivateLazy.getInstance();
    }
}
