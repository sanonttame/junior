package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс тестирующий класс факториал .
 */
public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial one = new Factorial();
        int result = one.factorial(5);
        assertThat(result,is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial one = new Factorial();
        int result = one.factorial(0);
        assertThat(result,is(1));
    }
}

