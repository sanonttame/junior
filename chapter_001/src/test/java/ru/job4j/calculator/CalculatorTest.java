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
         double result = calc.add(1D, 2D);
         double expected = 3D;
         assertThat(result, is(expected));
     }
    @Test
    public void whenAddOneMinusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.sub(4D, 1D);
        double expected = 3D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAddOneMultipleOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.multiple(2D, 3D);
        double expected = 6D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAddOneDivOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.div(10D, 2D);
        double expected = 5D;
        assertThat(result, is(expected));
    }

}