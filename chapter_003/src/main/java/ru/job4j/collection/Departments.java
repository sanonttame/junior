package ru.job4j.collection;

import java.util.*;

public class Departments {

    static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String e : value.split("/")) {
                tmp.add(start + e);
                start = e + "/";
            }
        }
        List<String> result = new ArrayList<>(tmp);
        Departments.sortAsc(result);
        return result;
    }

    private static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs);
        Collections.reverse(orgs);
    }
}
