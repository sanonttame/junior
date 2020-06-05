package ru.job4j.stream.groupstudents;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Group {
    static Map<String, Set<String>> sections(List<Student> students) {
        return students
                .stream()
                .flatMap(student ->student.getUnits()
                        .stream()
                        .map(unit -> new Holder(student.getName(), unit))
                )
                .collect(Collectors.groupingBy(t -> t.key, Collector.of(
                        HashSet::new,
                        (set, el) -> set.add(el.value),
                        (left, right) -> {
                            left.addAll(right);
                            return left;
                        }
                        )
                )
        );
    }
}
