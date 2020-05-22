package ru.job4j.stream.groupstudents;

import java.util.Set;

class Student {
    private String name;
    private Set<String> units;

    Student(String name, Set<String> units) {
        this.name = name;
        this.units = units;
    }

    String getName() {
        return name;
    }

    Set<String> getUnits() {
        return units;
    }
}
