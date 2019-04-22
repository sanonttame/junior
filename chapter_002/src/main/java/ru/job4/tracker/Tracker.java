package ru.job4.tracker;

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
    private final Item[] items = new Item[100];

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
        this.items[this.position++] = item;
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
            if(item != null && item.getId().equals(id)) {
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
            if (item != null && item.getId().equals(id)) {
                this.items[index] = item;
                this.items[index].setId(id);
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
    public boolean delete(String id){
        boolean result = false;
        for (int i = 0; i != this.position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                this.items[i] = null;
                System.arraycopy(items, i + 1, items, i, this.position - i - 1);
                this.position--;
                result = true;
            }
        }
		return result;
    }

    public Item[] findAll() {
		return Arrays.copyOf(this.items, this.position);

    }

    public Item[] findByName(String key){
        Item[] result = new Item[this.position];
        for (int i = 0; i < this.position; i++) {
            if(items[i] != null && items[i].getName().equals(key)) {
                result[i] = items[i];
                break;
            }
        }
        return result;
    }
}