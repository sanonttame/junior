package ru.job4j.collection;

import java.util.*;
/**
 * Converts all list arrays to a list.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class ConvertList {
    /**
     * Method converts all list arrays to a list.
     * @param list list with arrays
     * @return list with elements of arrays
     */
    public static List<Integer> convert(List<int[]> list){
        List<Integer> rsl = new ArrayList<>();
        for (int[] array: list) {
            for (int cell : array){
                rsl.add(cell);
            }
        }
        return rsl;
    }
}
