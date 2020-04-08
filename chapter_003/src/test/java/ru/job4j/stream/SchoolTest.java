package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/** Test class School
 * @version 0.1
 * @since 0.1
 * @author Anton Tsema
 */
public class SchoolTest {

    Student one = new Student(30);
    Student two = new Student(40);
    Student three = new Student(50);
    Student fouth = new Student(60);
    Student five = new Student(70);
    Student six = new Student(80);
    List<Student> students = List.of(one, two, three, fouth, five, six);
    School school = new School();
    @Test
    public void StudentsA(){
        List<Student> result = school.collect(students,student->(student.score >= 70 && student.score < 100));
        List<Student> expect = List.of(five, six);
        assertThat(result, is(expect));
    }
    @Test
    public void StudentsB(){
        List<Student> result = school.collect(students,student->(student.score >= 50 && student.score < 70));
        List<Student> expect = List.of(three, fouth);
        assertThat(result, is(expect));
    }
    @Test
    public void StudentsC(){
        List<Student> result = school.collect(students,student->(student.score < 50));
        List<Student> expect = List.of(one, two);
        assertThat(result, is(expect));
    }

}
