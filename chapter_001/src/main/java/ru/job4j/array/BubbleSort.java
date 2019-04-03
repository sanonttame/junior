package ru.job4j.array;

/**
 * Класс выполняющий сортировку "пузырьком".
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class BubbleSort {
    public int[] sort(int[] array){
        int temp;
        boolean sort = true;
        while(sort) {
            sort = false;
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    temp = array[index + 1];
                    array[index + 1] = array[index];
                    array[index] = temp;
                    sort = true;
                }
            }
        }
        return array;
    }
}
