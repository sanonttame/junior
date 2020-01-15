package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Petr");
        names.add("Akakiy");
        names.add("Stefan");

        for (Object name:names){
            System.out.println(name);
        }
    }
}
