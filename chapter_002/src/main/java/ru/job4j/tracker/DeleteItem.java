package ru.job4j.tracker;
/**
 * Метод расширяет класс BaseAction. Создает удаляет заявку.
 */
public class DeleteItem extends BaseAction {
    public DeleteItem(int key, String name) {
        super(key, name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Идентификатор заявки : ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена!");
        } else {
            System.out.println("Заявки с таким id не существует.");
        }
    }
}
