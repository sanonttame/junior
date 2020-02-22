package ru.job4j.tracker;

import java.util.*;

public class StubInput implements Input {

    private final ArrayList<String> value;

    private int position = 0;

    public StubInput(final ArrayList value) {
        this.value = value;
    }

    @Override

    public String ask(String question) {
        return this.value.get(this.position++);
    }

    @Override
	public int ask(String question, ArrayList<Integer> range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new MenuOutException("вы вышли за пределы меню");
        }
        return key;
	}

}
