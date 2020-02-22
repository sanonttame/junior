package ru.job4j.tracker;

/**
 * Реализация шаблона Singleton Eager loading - загружает объект сразу после старта виртуальной машины.
 *
 * Решение подходит для многопоточных приложений, при условии отсутствия опасности возникновения исключительных
 * ситуаций в конструкторе и отсутствии необходимости ленивой инициализации.
 */
public class SecondTrackerSingleton {
    //Нормальная инициализация (потокобезопасно, проcто и прозрачно).
    private static final SecondTrackerSingleton INSTANCE = new SecondTrackerSingleton();

    private SecondTrackerSingleton() {
    }

    public static SecondTrackerSingleton getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }
}
