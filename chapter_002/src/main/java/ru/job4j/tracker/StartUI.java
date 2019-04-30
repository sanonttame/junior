package ru.job4j.tracker;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа меню для просмотра всех заявок.
     */
    private static final String FINDALL = "1";

    /**
     * Константа меню для просмотра редактирования заявки.
     */
    private static final String EDIT = "2";

    /**
     * константа меня для удаления заявки.
     */
    private static final String DELT = "3";

    /**
     * Константа для поиска заявки по ID.
     */
     private static final String FINDID = "4";

    /**
     * Константа для поиска по имени.
     */
    private static final String FINDNM = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";

    /**
     * Получение данных от пользователя.
     */
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
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (FINDALL.equals(answer)) {
                this.findAll();
            } else if (EDIT.equals(answer)) {
                this.replaceItem();
            } else if (DELT.equals(answer)) {
                this.deleteItem();
            } else if (FINDID.equals(answer)) {
                this.findById();
            } else if (FINDNM.equals(answer)) {
                this.findByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, System.currentTimeMillis());
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с Id : " + item.getId() + "-----------");
    }
    /**
     * Метод реализует изменение заявки.
     */
    private void replaceItem() {
        System.out.println("------------ Редактирование заявки --------------");
        String id = this.input.ask("Введите идентификатор заявки, которую хотите изменить : ");
        String name = this.input.ask("Новое имя заявки : ");
        String desc = this.input.ask("Введите описание заявки : ");
        Item item = new Item(name, desc, System.currentTimeMillis());
        if (this.tracker.replace(id, item)) {
            System.out.println("------ Заявка с Id : " + item.getId() + " успешно изменена -----------");
        } else {
            System.out.println("Заявки с таким id нет.");
        }
    }
    /**
     * Поиск всех заявок.
     * @return значения массива в виде строки
     */
    private void findById() {
        System.out.println("------------ Поиск заявки по ID --------------");
        String id = this.input.ask("Введите идентификатор заявки : ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Такой заявки не существует.");
        } else {
            System.out.println(item.getName());
        }
    }
    private void findAll() {
        Item[] array = tracker.findAll();
        System.out.println("------------ Все заявки : --------------");
        for (int i = 0; i != array.length; i++) {
            System.out.println(array[i].getName());
        }
    }
    /**
     * Метод реализует удаление заявки.
     */
    private void deleteItem() {
        String id = this.input.ask("Идентификатор заявки : ");
        if (this.tracker.delete(id)) {
            System.out.println("Заявка удалена!");
        } else {
            System.out.println("Заявки с таким id не существует.");
        }
    }
    /**
     * Поиск по имени.
     * @return значения массива в виде строки
     */
    private void findByName() {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = this.input.ask("Введите имя заявки : ");
        Item[] array = tracker.findByName(name);
        for (int i = 0; i != array.length; i++) {
            System.out.println(array[i].getName());
        }
    }
    /**
     * Метод реализует консольное меню.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println(
                "0. Добавить новую заявку.\n" + "1. Показать все заявки.\n" + "2. Редактировать заявку.\n" + "3. Удалить заявку.\n" + "4. Найти заявку по идентификатору.\n" + "5. Найти заявку по имени.\n" + "6. Выйти.\n");
    }

    /**
     * Запуск программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new StubInput(new String[] {""}), new Tracker()).init();
    }
}