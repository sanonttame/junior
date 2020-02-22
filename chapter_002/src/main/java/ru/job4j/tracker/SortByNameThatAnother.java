package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Класс сравнивающий по имени объекты Item.
 * @author Anton
 * @version 0.1
 */
class SortByNameThatAnother implements Comparator<Item> {
    /**
     * Переопредение метода compare
     * @param that объект с большим значение name
     * @param another объект с меньшим значением name
     * @return 1 если истинно , -1 если ложно
     */
    @Override
    public int compare(Item that, Item another) {
        return that.getName().compareTo(another.getName());
    }
}