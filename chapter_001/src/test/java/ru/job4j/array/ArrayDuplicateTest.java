package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arr = new ArrayDuplicate();
        String[] array = {"Привет", "Мир", "Мир", "Привет", "Привет", "Привет", "Привет", "Супер", "Мир", "Привет", "Привет", "Привет"};
        String[] result = arr.remove(array);
        String[] expect = {"Привет", "Мир", "Супер"};
        assertThat(expect, is(result));
    }
}

