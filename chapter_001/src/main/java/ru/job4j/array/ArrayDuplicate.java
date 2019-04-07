package ru.job4j.array;
import java.util.Arrays;
/**
 * Класс удаляющий дупликаты в массиве.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
*/
public class ArrayDuplicate {
    /**
     * Метод удаляющтй дупликаты.
     *
     * @param array массив
     * @return обновленный массив.
     */
    public String[] remove(String[] array) {
        int counter = array.length;
        for(int i = 0; i < counter; i++) {
            for (int j = i + 1; j < counter; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[counter - 1];
                    counter--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, counter);
    }
}


