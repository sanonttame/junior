package ru.job4j.stream.groupstudents;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class Group {
    static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream()
                .flatMap(student -> {
                    List<Holder> holders = new ArrayList<>();
                    for(String section : student.getUnits()) {
                        holders.add(new Holder(student.getName(), section));
                    }
                    return holders.stream();
                }
                )
                .collect(Collectors.groupingBy(t -> t.key, Collector.of(
                        HashSet::new,
                        (set, el) -> set.add(el.value),
                        (left, right) -> {left.addAll(right);
                        return left;
                        }
                        )
                )
        );
    }
}
