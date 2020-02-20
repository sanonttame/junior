package ru.job4j.collection;
import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserSortTest {
    User first = new User("Max",20);
    User second = new User("Karl",19);
    @Test
    public void UserSortByAgeAscending() {
        assertThat(new UserSort.ByAgeAscending().compare(first, second), is(1));
    }
    @Test
    public void UserSortByAgeDescending(){
        assertThat(new UserSort.ByAgeDescending().compare(second, first),is(1));
    }
    @Test
    public void UserSortByNameDescending(){
        assertThat(new UserSort.ByNameDescending().compare(second, first),greaterThan(0));
    }
    @Test
    public void UserSortByNameAscending(){
        assertThat(new UserSort.ByNameAscending().compare(first, second),greaterThan(0));
    }
    @Test
    public void UserSortByAgeAscentingByNameDescending(){
        assertThat(new UserSort.ByAgeAscending().thenComparing(
                new UserSort.ByNameDescending()).compare(first, second),is(1));
    }
    @Test
    public void UserSortByNameDescentingByAgeAscending(){
        assertThat(new UserSort.ByNameAscending().thenComparing(
                new UserSort.ByAgeDescending()).compare(first, second),greaterThan(0));
    }

}
