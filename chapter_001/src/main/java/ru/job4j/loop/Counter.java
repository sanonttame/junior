package ru.job4j.loop;
/**
 * Класс складывает четные значения в выбранной области.
 *  @author Anton Narayan
 *  @version 01
 *  @since 0.1
**/
public class Counter {
    /**
     * Считаем сумму чётных.
     * @param start начало диапазона.
     * @param finish конец диапазона.
     * @return Сумма чётных.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}