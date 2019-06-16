package ru.job4j.tracker;
/**
 * Метод расширяет класс UserAction. Находит заявку по идентификатору.
 */
public class FindById extends BaseAction {

    public FindById(int key, String name){
        super(key, name);
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
}
