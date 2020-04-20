package ru.job4j.stream.school;

/**
 * @version 0.1
 * @since 0.2
 * @author Anton Tsema
 */
class Student {
    String surname;
    int score;

    Student(String surname, int score) {
        this.surname = surname;
        this.score = score;
    }

    String getSurname() {
        return surname;
    }

    int getScore() {
        return score;
    }
}


