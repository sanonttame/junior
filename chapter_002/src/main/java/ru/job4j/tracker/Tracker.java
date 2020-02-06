package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author Anton Narayan
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    private static final Random RN = new Random();
    /**
     * Массив для хранение заявок.
     */
    private final ArrayList<Item> items = new ArrayList<>();
    //private final ArrayList<Item> items = new ArrayList<>();

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище.
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(this.position++, item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
    /**
     * Метод ищет заявку по идентификатору.
     * @param id Идентификатор заявки.
     * @return найденную по Id заявку.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
		return result;
    }
    /**
     * Метод заменяет одну заявку на другую.
     * @param id Идентификатор заявки.
     * @param item Заявка, заменяющая старую.
     * @return true or false
     */
    public boolean replace(String id, Item item) {
        boolean result = false;

         for (int index = 0; index != this.position; index++) {
            if (item != null &&  items.get(index).getId().equals(id)) {
                items.set(index, item);
                items.get(index).setId(id);
                result = true;
                break;
            }
        }


        return result;
    }
    /**
     * Метод удаляющий ячейку.
     * @param id Идентификатор заявки
     * @return true or false
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (items.get(i) != null && items.get(i).getId().equals(id)) {
                items.remove(i);
                this.position--;
                result = true;
            }
        }
		return result;
    }
    /**
     * Метод выводящий все элементы массива.
     * @return массив
     */
    public ArrayList<Item> findAll() {
		return items;
    }
    /**
     * Метод ищущий элементы по имени.
     * @param key имя элемента
     * @return массив найденных элементов.
     */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        for (int i = 0; i < this.position; i++) {
            if (items.get(i) != null && items.get(i).getName().equals(key)) {
                result.add(items.get(i));
            }
        }
        return result;
    }
}