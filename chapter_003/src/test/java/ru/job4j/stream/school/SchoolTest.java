package ru.job4j.stream.school;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/** Test class School
 * @version 0.1
 * @since 0.1
 * @author Anton Tsema
 */
public class SchoolTest {

    private Student one = new Student("Karl", 30);
    private Student two = new Student("Roman", 40);
    private Student three = new Student("Mick", 50);
    private Student fouth = new Student("Anton", 60);
    private Student five = new Student("Dmitrii", 70);
    private Student six = new Student("Polovec", 80);
    private Student seven = new Student("Evkakii", 90);
    private List<Student> students = List.of(one, two, three, fouth, five, six, seven);
    private School school = new School();
    @Test
    public void studentsA() {
        List<Student> result = school.collect(students, student -> (student.score >= 70 && student.score < 100));
        List<Student> expect = List.of(five, six, seven);
        assertThat(result, is(expect));
    }
    @Test
    public void studentsB() {
        List<Student> result = school.collect(students, student -> (student.score >= 50 && student.score < 70));
        List<Student> expect = List.of(three, fouth);
        assertThat(result, is(expect));
    }
    @Test
    public void studentsC() {
        List<Student> result = school.collect(students, student -> (student.score < 50));
        List<Student> expect = List.of(one, two);
        assertThat(result, is(expect));
    }
    @Test
    public void collectToMap() {
        Map<String, Student> result = school.collectToMap(students, student -> (student.score < 50));
        Map<String, Student> expect = Map.of(one.surname, one, two.surname, two);
        assertThat(result, is(expect));
    }
    @Test
    public void whenBoundOver60() {
        List<Student> result = school.levelOf(students, 61);
        List<Student> expect = List.of(seven, six, five);
        assertThat(result, is(expect));
    }
}
