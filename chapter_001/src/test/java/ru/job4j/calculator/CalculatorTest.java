package ru.job4j.calculator;

import org.junit.Test;
import ru.job4j.calculator.Calculator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class Calculator.
 *
 * @author Narayan Anton 
 * @version 0.1
 * @since 0.1
 */

public class CalculatorTest  {
     @Test
     public void whenAddOnePlusOneThenTwo()  {
         Calculator calc = new Calculator();
         double result = calc.add(1D, 1D);
         double expected = 2D;
         assertThat(result, is(expected));
     }
    @Test
    public void whenAddOneMinusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.sub(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAddOneMultipleOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.multiple(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAddOneDivOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.div(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

}