package ru.job4j.tracker;

public enum ThirdTrackerSingleton {
    instance;

    public Item add(Item model) {
        return model;
    }
}
