package ru.job4j.tracker;
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
        Item[] array = tracker.findByName(name);
        for (int i = 0; i != array.length; i++) {
            System.out.println(array[i].getName());
        }
    }
}
