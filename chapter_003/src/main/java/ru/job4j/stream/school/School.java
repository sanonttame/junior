package ru.job4j.stream.school;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * School
 * @author Anton Tsema
 * @since 0.1
 * @version 0.3
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
     * @param students students
     * @param predict predict
     * @return Map<Student.surname, Students Student>
     */
    Map<String, Student> collectToMap(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toMap(Student::getSurname, Student->Student));
    }

    /**
     * students who passed the exam
     * @param students students
     * @param bound lvl
     * @return list of students
     */
    List<Student> levelOf(List<Student> students, int bound){
        return students.stream()
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .takeWhile(student -> (student.score > bound))
                .collect(Collectors.toList());
    }
}
