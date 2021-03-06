package ru.job4j.tracker;


import java.util.*;

/**
 * Класс, содержащий логику взаимодействия с пользователем.
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    private Input input;
    /**
     * Флажок для выхода.
     * Программа работает до тех пор, пока значение истинно.
     */
    private boolean working = true;
    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;
    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Основой цикл программы.
     */
    void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        ArrayList<Integer> range = new ArrayList<>();
        menu.fillActions(this);
        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range.add(i);
        }
        do {
            menu.show();
            menu.select(input.ask("Выбор : ",  range));
        } while (this.working);
    }
    void stop() {
        this.working = false;
    }


    /**
     * Запуск программы.
     * @param args args
     */

    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }
}