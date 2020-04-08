package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * School
 * @author Anton Tsema
 * @since 0.1
 * @version 0.1
 */
class School {
    /**
     * Method dividing a class by points into three groups
     * @param students students
     * @param predict predicate
     * @return list of students
     */
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
