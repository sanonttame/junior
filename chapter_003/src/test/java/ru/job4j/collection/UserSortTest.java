package ru.job4j.collection;
import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserSortTest {
    User first = new User("Max", 20);
    User second = new User("Karl", 19);
    @Test
    public void userSortByAgeAscending() {
        assertThat(new UserSort.ByAgeAscending().compare(first, second), is(1));
    }
    @Test
    public void userSortByAgeDescending() {
        assertThat(new UserSort.ByAgeDescending().compare(second, first), is(1));
    }
    @Test
    public void userSortByNameDescending() {
        assertThat(new UserSort.ByNameDescending().compare(second, first), greaterThan(0));
    }
    @Test
    public void userSortByNameAscending() {
        assertThat(new UserSort.ByNameAscending().compare(first, second), greaterThan(0));
    }
    @Test
    public void userSortByAgeAscentingByNameDescending() {
        assertThat(new UserSort.ByAgeAscending().thenComparing(new UserSort.ByNameDescending()).compare(first, second), is(1));
    }
    @Test
    public void userSortByNameDescentingByAgeAscending() {
        assertThat(new UserSort.ByNameAscending().thenComparing(new UserSort.ByAgeDescending()).compare(first, second), greaterThan(0));
    }

}
