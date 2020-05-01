package ru.job4j.search;

import java.util.LinkedList;

class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();
    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            if (element.getPriority() < task.getPriority()) {
                index++;
            } else {
                break;
            }
        }
        this.tasks.add(index, task);
    }

    Task take() {
        return tasks.remove(0);
    }
}
