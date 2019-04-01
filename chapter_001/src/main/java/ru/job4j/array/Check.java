package ru.job4j.array;

/**
 * Массив заполненный true или false.
 * @author Anton Narayan
 *
 */
public class Check {
    /**
     * @param array массив
     * @return true or false
     */
    public boolean mono(boolean[] array){
         boolean result = false;
         for (int index = 0; index < array.length - 1;) {
             if (array[index] == array[index + 1]) result = true;
             else result = false;
             break;
         }
        return result;
    }

}
