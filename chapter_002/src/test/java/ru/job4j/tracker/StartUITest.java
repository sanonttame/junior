package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.assertThat;

/**
 * Тест класса StartUI.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
*/
public class StartUITest {
    private Tracker tracker = new Tracker();
    private final PrintStream stout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void BeforeTestClass() {
        {
            tracker.add(new Item("testOne", "first", System.currentTimeMillis()));
            tracker.add(new Item("testTwo", "second", System.currentTimeMillis()));
            tracker.add(new Item("testThird", "third", System.currentTimeMillis()));
            System.setOut(new PrintStream(this.out));
        }

    }

    @After
    public void AfterTestClass() {
        System.setOut(new PrintStream(this.stout));
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "y"});
        new StartUI(input, this.tracker).init();
        assertThat(this.tracker.findAll()[3].getName(), is("test name"));
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Input input = new StubInput(new String[]{"5", tracker.findAll()[2].getId(), "test replace", "заменили заявку", "y"});
        new StartUI(input, this.tracker).init();
        assertThat(tracker.findAll()[2].getName(), is("test replace"));
    }

    @Test
    public void whenDeleteItem() {
        Input input = new StubInput(new String[]{"2", tracker.findAll()[1].getId(), "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().length, is(2));
    }

    @Test
    public void whenFindbyId() {
        Input input = new StubInput(new String[]{"3", tracker.findAll()[0].getId(), "y"});
        Item item = tracker.findById(tracker.findAll()[0].getId());
        new StartUI(input, tracker).init();
        assertThat(out.toString().contains(item.getName()), is(true));
    }

    @Test
    public void whenFindbyName() {
        Input input = new StubInput(new String[]{"4", tracker.findAll()[0].getName(), "y"});
        StringBuilder result = new StringBuilder();
        for (Item item : this.tracker.findByName(tracker.findAll()[0].getName())) {
            result.append(item.getName());
        }
        new StartUI(input, tracker).init();
        assertThat(out.toString().contains(result), is(true));
    }
    @Test
    public void whenShowAll() {
        Input input = new StubInput(new String[]{"1", "y"});
        StringBuilder result = new StringBuilder();
        result.append("0. Добавление новой заявки.")
                .append(System.lineSeparator() + "1. Вывод всех заявок")
                .append(System.lineSeparator() + "2. Удаление заявки.")
                .append(System.lineSeparator() + "3. Поиск заявки по идентификатору.")
                .append(System.lineSeparator() + "4. Поиск заявки по имени.")
                .append(System.lineSeparator() + "5. Замена заявки.")
                .append(System.lineSeparator() + "6. Выход.")
                .append(System.lineSeparator() + "------------ Все заявки : --------------");
        for (int i = 0; i < this.tracker.findAll().length; i++) {
            result.append(System.lineSeparator() + this.tracker.findAll()[i].getId() + " "
                    + this.tracker.findAll()[i].getName() + " "
                    + this.tracker.findAll()[i].getDecs()
            );
        }
        result.append(System.lineSeparator());
        new StartUI(input, tracker).init();
        assertThat(new String(out.toString()).contains(result.toString()), is(true));
    }
}