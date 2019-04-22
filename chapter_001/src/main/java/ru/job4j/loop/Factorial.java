package ru.job4j.loop;
/**
 * Класс считающий факториал числа.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
*/
public class Factorial {
    /**
     * Считаем факториал числа.
     * @param x число
     * @return result
     */
    public int factorial(int x) {
        int result = 1;
        if (x == 0) {
            return result;
        }
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }
}
