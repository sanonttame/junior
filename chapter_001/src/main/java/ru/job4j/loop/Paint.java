package ru.job4j.loop;
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
     public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int x = 0; x != height; x++) {
            for (int y = 0; y != width; y++) {
                if (x >= y) {
                    screen.append("^");
                } else
                    screen.append(" ");
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
   public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int x = 0; x != height; x++) {
            for (int y = 0; y != width; y++) {
                if (x >= width - y- 1) {
                    screen.append("^");
                } else
                    screen.append(" ");
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    public String Trl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = 2* height - 1;
        for (int x = 0; x != height; x++) {
            for (int y = 0; y != width; y++) {
                if (x >= width - y - 1 && y <= height + x - 1) {
                    screen.append("^");
                } else
                    screen.append(" ");
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
