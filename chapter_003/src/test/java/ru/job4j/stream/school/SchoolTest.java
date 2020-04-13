package ru.job4j.stream.school;

import org.junit.Test;
import ru.job4j.stream.school.School;
import ru.job4j.stream.school.Student;

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

    private Student one = new Student("Karl",30);
    private Student two = new Student("Roman",40);
    private Student three = new Student("Mick",50);
    private Student fouth = new Student("Anton",0);
    private Student five = new Student("Dmitrii",70);
    private Student six = new Student("Polovec",80);
    private List<Student> students = List.of(one, two, three, fouth, five, six);
    private School school = new School();
    @Test
    public void studentsA(){
        List<Student> result = school.collect(students,student->(student.score >= 70 && student.score < 100));
        List<Student> expect = List.of(five, six);
        assertThat(result, is(expect));
    }
    @Test
    public void studentsB(){
        List<Student> result = school.collect(students,student->(student.score >= 50 && student.score < 70));
        List<Student> expect = List.of(three);
        assertThat(result, is(expect));
    }
    @Test
    public void studentsC(){
        List<Student> result = school.collect(students,student->(student.score < 50));
        List<Student> expect = List.of(one, two, fouth);
        assertThat(result, is(expect));
    }
    @Test
    public void collectToMap(){
        Map<String, Student> result = school.collectToMap(students ,student->(student.score < 50));
        Map<String, Student> expect = Map.of(one.surname, one, two.surname, two, fouth.surname, fouth);
        assertThat(result, is(expect));
    }

}
