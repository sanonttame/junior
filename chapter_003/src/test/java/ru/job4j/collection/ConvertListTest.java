package ru.job4j.collection;

import java.util.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Test class ConvertList
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = List.of(new int[] {1}, new int[] {2, 3});
        List<Integer> expect = Arrays.asList(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }
}

