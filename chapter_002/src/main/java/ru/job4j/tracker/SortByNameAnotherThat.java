package ru.job4j.tracker;

import java.util.Comparator;
/**
 * Класс сравнивающий по имени объекты Item.
 * @author Anton
 * @version 0.1
 */
class SortByNameAnotherThat implements Comparator<Item> {
    /**
     * Переопредение метода compare
     * @param that объект с меньшим значением name
     * @param another объект с большим значение name
     * @return 1 если истинно , -1 если ложно
     */
    @Override
    public int compare(Item that, Item another) {
        return another.getName().compareTo(that.getName());
    }
}