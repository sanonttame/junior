package ru.job4j.tracker;
/**
 * Метод расширяет класс UserAction. Создает удаляет заявку.
 */
public class DeleteItem implements UserAction {
    @Override
    public int key() {
        return 2;
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
        public String info() {
                return String.format("%s. %s", this.key(), "Удаление заявки."); }
}
