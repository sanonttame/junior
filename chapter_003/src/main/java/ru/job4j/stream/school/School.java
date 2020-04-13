package ru.job4j.stream.school;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * School
 * @author Anton Tsema
 * @since 0.1
 * @version 0.2
 */
class School {
    /**
     * Method dividing a class by points into groups
     * @param students students
     * @param predict predicate
     * @return list of students
     */
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    /**
     * Method dividing a class by points into groups
     * @param students
     * @param predict
     * @return Map<Student.surname, Students Student>
     */
    Map<String, Student> collectToMap(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toMap(Student::getSurname, Student->Student));
    }
}
