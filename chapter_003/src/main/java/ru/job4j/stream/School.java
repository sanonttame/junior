package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * School
 * @author Anton Tsema
 * @since 0.1
 * @version 0.1
 */
public class School {
    /**
     * Method dividing a class by points into three groups
     * @param students students
     * @param predict predicate
     * @return
     */
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> result = students.stream().filter(predict).collect(Collectors.toList());
        return result;
    }
}
