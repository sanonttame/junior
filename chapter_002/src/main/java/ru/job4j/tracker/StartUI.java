package ru.job4j.tracker;



/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    private final Input input;
    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;
    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Основой цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        int[] range = new int[7];
        menu.fillActions();
        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range[i] = i;
        }
        do {
            menu.show();
            menu.select(input.ask("выбор", range));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }

        /**
     * Поиск всех заявок.
     * @return значения массива в ви0де строки
     */

    /**
     * Запуск программы.
     * @param args
     */

    public static void main(String[] args) {
        new StartUI(
                new ValidateInput(
                        new ConsoleInput()
                ),
                new Tracker()
        ).init();
    }
}