package ru.job4j.stream.groupstudents;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class GroupTest {
    @Test
    public void groupListStudent() {
        List<Student> students = List.of(
                new Student("Andrey", Set.of("basketbol", "soccer", "music", "golf")),
                new Student("Pol", Set.of("golf", "music")),
                new Student("Karl", Set.of("soccer", "basketbol", "music"))
                );
        Map<String, Set<String>> expected = Map.of(
                "Karl", Set.of("soccer", "music", "basketbol"),
                "Andrey", Set.of("soccer", "golf", "music", "basketbol"),
                "Pol", Set.of("golf", "music"));


        assertThat(Group.sections(students),is(expected));
    }
}