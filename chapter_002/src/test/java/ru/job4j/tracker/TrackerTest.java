package ru.job4j.tracker;

import org.junit.Test;
import ru.job4.tracker.Item;
import ru.job4.tracker.Tracker;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * Тест класса Tracker.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
    @Test
    public void whenAddNewItemAndUsedFindByName() {
        Tracker tracker = new Tracker();
        Item itemOne = new Item("test1", "testDescription", 123L);
        Item itemTwo = new Item("test2", "testDescription", 1234L);
        Item itemThree = new Item("test1", "testDescription", 12345L);
        tracker.add(itemOne);
        tracker.add(itemTwo);
        tracker.add(itemThree);
        Item[] result = {itemOne, itemThree};
        assertThat(tracker.findByName("test1"), is(result));
    }
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item itemOne = new Item("test1", "testDescription", 123L);
        Item itemTwo = new Item("test2", "testDescription", 1234L);
        Item itemThree = new Item("test3", "testDescription", 12345L);
        tracker.add(itemOne);
        tracker.add(itemTwo);
        tracker.add(itemThree);
        Tracker result = new Tracker();
        result.add(itemOne);
        result.add(itemThree);
        tracker.delete(itemTwo.getId());
        assertThat(tracker.findAll(), is(result.findAll()));
    }
}

