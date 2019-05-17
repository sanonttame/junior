package ru.job4j.tracker;

public class FindAll implements UserAction {
    public int key() {
        return 1;
    }

    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Все заявки : --------------");
        Item[] array = tracker.findAll();
        for (int i = 0; i != array.length; i++) {
            System.out.println(array[i].getId() + " " + array[i].getName() + " " + array[i].getDecs());
        }
    }
    public String info() {
        return String.format("%s. %s", this.key(), "Вывод всех заявок");
    }
}
