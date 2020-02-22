package ru.job4j.tracker;
/**
 * Метод расширяет класс BaseAction. Заменяет заявку на новую.
 */
public class ReplaceItem extends BaseAction {
    public ReplaceItem(int key, String name) {
        super(key, name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Введите иденификатор заявки, которая будет заменена: ");
        String name = input.ask("Введине имя новой заявки: ");
        String desc = input.ask("Введите описание: ");
        Item item = new Item(name, desc, System.currentTimeMillis());
        if (tracker.replace(id, item)) {
            System.out.println("Заявка с id " + id + " успешно заменена.");
        } else {
            System.out.println("Заявки с таким id не существует.");
        }
    }

}
