package ru.job4j.array;
/**
 * Тест класса BubbleSort.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort arr = new BubbleSort();
        int[] array = {6, 5, 2, 3, 1};
        int[] result = arr.sort(array);
        int[] expect = {1, 2, 3, 5, 6};
        assertThat(result, is(expect));
    }
}