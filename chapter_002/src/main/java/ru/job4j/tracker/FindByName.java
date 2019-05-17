package ru.job4j.tracker;
/**
 * Метод расширяет класс UserAction. аходит заявку по имени.
 */
public class FindByName implements UserAction {
    @Override
    public int key() {
        return 4;
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
    public String info() {
        return String.format("%s. %s", this.key(), "Поиск заявки по имени.");
    }
}
