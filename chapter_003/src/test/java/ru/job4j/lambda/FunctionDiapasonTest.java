package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class FunctionDiapasonTest{
    FunctionDiapason function = new FunctionDiapason();
    @Test
    public void whenFuncdiapason() {
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
        }
        @Test
    public void whenFuncLog() {
        List<Double> result = function.diapasonLog(5,8);
        List<Double> expected = Arrays.asList(Math.log(5), Math.log(6), Math.log(7));
        assertThat(result, is(expected));
        }
        @Test
        public void whenFuncQadr(){
            List<Double> result = function.diapasonQudr(5,8);
            List<Double> expected = Arrays.asList(Math.pow(5, 2), Math.pow(6 , 2), Math.pow(7, 2));
            assertThat(result, is(expected));
        }
}