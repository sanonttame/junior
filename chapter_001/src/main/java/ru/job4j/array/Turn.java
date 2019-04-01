package ru.job4j.array;
/**
 * Класс - перевернуть массив.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class Turn {
    /**
     * @param array массив
     * @return array
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}

