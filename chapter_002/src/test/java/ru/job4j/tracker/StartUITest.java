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
    public void BeforeTest() {
        {
            tracker.add(new Item("testOne", "first", System.currentTimeMillis()));
            tracker.add(new Item("testTwo", "second", System.currentTimeMillis()));
            tracker.add(new Item("testThird", "third", System.currentTimeMillis()));
            System.setOut(new PrintStream(this.out));
        }

    }

    @After
    public void AfterTest() {
        System.setOut(new PrintStream(this.stout));
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, this.tracker).init();
        assertThat(this.tracker.findAll()[3].getName(), is("test name"));
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Input input = new StubInput(new String[]{"2", tracker.findAll()[2].getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, this.tracker).init();
        assertThat(tracker.findAll()[2].getName(), is("test replace"));
    }

    @Test
    public void whenDeleteItem() {
        Input input = new StubInput(new String[]{"3", tracker.findAll()[1].getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().length, is(2));
    }

    @Test
    public void whenFindbyId() {
        Input input = new StubInput(new String[]{"4", tracker.findAll()[0].getId(), "6"});
        Item item = tracker.findById(tracker.findAll()[0].getId());
        new StartUI(input, tracker).init();
        assertThat(out.toString().contains(item.getName()), is(true));
    }

    @Test
    public void whenFindbyName() {
        Input input = new StubInput(new String[]{"5", tracker.findAll()[0].getName(), "6"});
        StringBuilder result = new StringBuilder();
        for (Item item : this.tracker.findByName(tracker.findAll()[0].getName())) {
            result.append(item.getName());
        }
        new StartUI(input, tracker).init();
        assertThat(out.toString().contains(result), is(true));
    }
    @Test
    public void whenShowAll() {
        Input input = new StubInput(new String[]{"1", "6"});
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.tracker.findAll().length; i++){
            result.append(System.lineSeparator() + this.tracker.findAll()[i].getName());
        }
        new StartUI(input, tracker).init();
        assertThat(new String(out.toString()).contains(result.toString()), is(true));
    }
}