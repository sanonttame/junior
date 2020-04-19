package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;
/**
 * class converts a matrix to a list
 * @version 0.1
 * @since 0.1
 * @author Anton Tsyoma
 */
class ListFromTheMatrix {
    /**
     * Method converts a matrix to a list
     * @param  array array
     * @return  list
     */
    List<Integer> listFromTheMatrix(Integer[][] array) {
         return Arrays.stream(array).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
