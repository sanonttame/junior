package ru.job4j.tracker;
/**
 * Метод расширяет класс UserAction. Находит заявку по идентификатору.
 */
public class FindById implements UserAction {
    @Override
    public int key() {
        return 3;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск заявки по ID --------------");
        String id = input.ask("Введите идентификатор заявки : ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Такой заявки не существует.");
        } else {
            System.out.println(item.getName());
        }
    }
    public String info() {
        return String.format("%s. %s", this.key(), "Поиск заявки по идентификатору.");
    }
}
