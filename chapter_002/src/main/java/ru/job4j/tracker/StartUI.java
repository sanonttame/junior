package ru.job4j.tracker;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    private final Input input;
    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;
    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Основой цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            menu.select(Integer.valueOf(input.ask("Выбор: ")));
        } while (!"y".equals(this.input.ask("Exit? (y): ")));
    }
        /**
     * Поиск всех заявок.
     * @return значения массива в ви0де строки
     */

    /**
     * Запуск программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}