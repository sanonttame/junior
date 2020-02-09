package ru.job4j.tracker;

import java.util.List;

/**
 * Метод расширяет класс BaseAction. аходит заявку по имени.
 */
public class FindByName extends BaseAction {
    public FindByName(int key, String name) {
        super(key, name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = input.ask("Введите имя заявки : ");
        List<Item> array = tracker.findByName(name);
        for (Item item : array) {
            System.out.println(item.getName());
        }
    }
}
