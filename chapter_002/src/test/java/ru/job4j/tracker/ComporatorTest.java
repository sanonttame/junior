package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * Test class task "componator"
 * @author Anton
 * @version 0.1
 */
public class ComporatorTest {
    private Item one = new Item("Mikkey", "first", 10);
    private Item two = new Item("Nick", "second", 20);
    @Test
    public void sortByNameAnotherThatTest() {
        SortByNameAnotherThat sort = new SortByNameAnotherThat();
        assertThat(-1, is(sort.compare(two, one)));
    }
    @Test
    public void sortByNameThatAnotherTest() {
        SortByNameThatAnother sort = new SortByNameThatAnother();
        assertThat(1, is(sort.compare(two, one)));
    }
}
