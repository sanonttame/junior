package ru.job4j.tracker;

/**
 * Метод расширяет класс UserAction. Создает новую заявку.
 */
public class AddItem implements UserAction {
    @Override
    public int key() {
        return 0;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.ask("Пожалуйста, введине имя: ");
        String desc = input.ask("Пожалуйста, введите описание: ");
        Item item = new Item(name, desc, System.currentTimeMillis());
        tracker.add(item);
        System.out.println("Заявка с id " + item.getId() + " добавлена.");

    }
    public String info() {
        return String.format("%s. %s", this.key(), "Добавление новой заявки.");
    }
}
