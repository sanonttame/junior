package ru.job4j.array;

/**
 * Класс выполняющий сортировку "пузырьком".
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        int temp;
        boolean sort = true;
        while (sort) {
            sort = false;
            //внешний цикл, перебирает индексы массива с конца.
            for (int index = array.length - 1; index != 0; index--) {
                //внутренний цикл перебирает индексы массива с начала. Благодаря этому получается меньше проходом внешнего цикла.
                for (int i = 0; i < index; i++) {
                    if (array[i + 1] < array[i]) {
                        temp = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = temp;
                        sort = true;
                    }
                }
            }
        }
        return array;
    }
}
