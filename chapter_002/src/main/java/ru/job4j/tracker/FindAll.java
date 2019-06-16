package ru.job4j.tracker;

public class FindAll extends BaseAction {
    public FindAll(int key, String name) {
        super(key, name);
    }
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Все заявки : --------------");
        Item[] array = tracker.findAll();
        for (int i = 0; i != array.length; i++) {
            System.out.println(array[i].getId() + " " + array[i].getName() + " " + array[i].getDecs());
        }
    }
}

