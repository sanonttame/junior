package ru.job4j.tracker;

public interface UserAction {
    /**
     * Метод возвращает ключ. Ключ - параметр действия.
     * @return key.
     */
    int key();

    /**
     * основной метод.
     * @param input
     * @param tracker
     */
    void execute(Input input, Tracker tracker);

    /**
     * Метод возвращает информацию о выбранном пункте меню.
     * @return
     */
    String info();
}
