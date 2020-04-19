package ru.job4j.stream.school;

import java.util.Comparator;

/**
 * @version 0.1
 * @since 0.2
 * @author Anton Tsema
 */
public class Student{
    String surname;
    int score;

    Student(String surname, int score) {
        this.surname = surname;
        this.score = score;
    }

    public String getSurname() {
        return surname;
    }

    public int getScore() {
        return score;
    }
}


