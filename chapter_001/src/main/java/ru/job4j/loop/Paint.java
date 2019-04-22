package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Класс строящий пирамиду.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class Paint {
    /**
     * метод строит пирамиду по значениям.
     *
     * @param height высота пирамиды.
     *@return объект Доска
     */
    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int x = 0; x != height; x++) {
            for (int y = 0; y != widht; y++) {
                if (predict.test(x, y)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (x, column) -> x >= column
        );
    }
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (y, column) -> y >= height - column - 1
        );
    }

    public String triangle(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (x, y) -> x >= height - y - 1 && x + height - 1 >= y
        );
    }

}
