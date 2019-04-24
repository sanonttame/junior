package ru.job4.tracker;

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
        System.out.println("Введите имя заявки :");
        String name = this.input.ask("Введите имя заявки :");
        System.out.println("Введите описание заявки :");
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
        System.out.println("Введите идентификатор заявки, которую хотите изменить : ");
        String id = this.input.ask("Введите идентификатор заявки, которую хотите изменить : ");
        System.out.println("Новое имя заявки : ");
        String name = this.input.ask("Новое имя заявки : ");
        System.out.println("Введите описание заявки : ");
        String desc = this.input.ask("Введите описание заявки : ");
        Item item = new Item(name, desc, System.currentTimeMillis());
        this.tracker.replace(id, item);
        System.out.println("------ Заявка с Id : " + item.getId() + "успешно изменена -----------");
    }
    /**
     * Поиск всех заявок.
     * @return значения массива в виде строки
     */
    private void findById(){
     System.out.println("Введите идентификатор заявки :");
     System.out.println(this.tracker.findById(this.input.ask("Введите идентификатор заявки : ")).getName());
    }
    private void findAll() {
        String[] array = new String[tracker.findAll().length];
        for (int i = 0; i != tracker.findAll().length; i++) {
            array[i] = tracker.findAll()[i].getName();
        }
        System.out.println("------------ Все заявки : --------------");
        System.out.println(Arrays.toString(array));
    }
    /**
     * Метод реализует удаление заявки.
     */
    private void deleteItem() {
        System.out.println("Введите идентификатор заявки, от которой хотите избавиться :");
        String id = this.input.ask("Идентификатор заявки");
        this.tracker.delete(id);
        System.out.println("Заявка удалена!");
    }
    /**
     * Поиск по имени.
     * @return значения массива в виде строки
     */
    private void findByName() {
        System.out.println("Введите имя заявки : ");
        String name = this.input.ask("Name");
        String[] array = new String[this.tracker.findByName(name).length];
        for (int i = 0; i != array.length; i++) {
            array[i] = tracker.findByName(name)[i].getName();
        }
        System.out.println(Arrays.toString(array));
    }
    /**
     * Метод реализует консольное меню.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println(
                "0. Добавить новую заявку.\n" +
                        "1. Показать все заявки.\n" +
                        "2. Редактировать заявку.\n" +
                        "3. Удалить заявку.\n" +
                        "4. Найти заявку по идентификатору.\n" +
                        "5. Найти заявку по имени.\n" +
                        "6. Выйти.\n" +
                        "\n" +
                        "Действие : ");
    }

    /**
     * Запуск программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}