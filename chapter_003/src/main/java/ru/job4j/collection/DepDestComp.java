package ru.job4j.collection;

import java.util.*;

public class DepDestComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] elementsO1 = o1.split("/");
        String[] elementsO2 = o2.split("/");
        int length = (elementsO1.length > elementsO2.length) ? elementsO1.length : elementsO2.length;
        List<String> tmp = new ArrayList<>();
        if (length == elementsO1.length) {
            for(int i = elementsO2.length; i < length; i++) {
                Collections.addAll(tmp,elementsO2);
                tmp.add("sssssss");
                elementsO2 = tmp.toArray(new String[length]);
            }
        }
        if (length == elementsO2.length) {
            for(int i = elementsO1.length; i < length; i++) {
                Collections.addAll(tmp,elementsO1);
                tmp.add("sssssss");
                elementsO1 = tmp.toArray(new String[length]);

            }
        }
        for (int i = 0; i < length;) {
            if (elementsO2[i].compareTo(elementsO1[i]) == 0) {
                i++;
            } else {
                return elementsO2[i].compareTo(elementsO1[i]);
            }
        }
        return 0;
    }
}