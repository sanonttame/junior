package ru.job4j.tracker;


public class MenuTracker {
    //получаем экземпляры объектов
    private Input input;
    private Tracker tracker;
    //создание действий которые описаны в системе
    private UserAction[] actions = new UserAction[6];

    /**
     * Конструктор класса MenuTracker.
     * @param input
     * @param tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Действия.
     */
    public void fillActions() {
        this.actions[0] = new AddItem();
        this.actions[1] = new FindAll();
        this.actions[2] = new DeleteItem();
        this.actions[3] = new FindById();
        this.actions[4] = new FindByName();
        this.actions[5] = new  ReplaceItem();
    }

    /**
     * Печать меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println((action.info()));
            }
        }
    }

    /**
     * Выбор действи.
     * @param key
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }
}
