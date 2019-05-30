package ru.job4j.tracker;

public class Exit implements UserAction {
    public int key() {
        return 6;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("Exit");
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Выход.");
    }
}