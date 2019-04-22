package ru.job4j.loop;
/**
 * Класс строит шахматную доску.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class Board {
    /**
     * метод строит шахматную доску по значениям.
     * @param width величина строки.
     * @param height величина столбца
     * @return объект Доска
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 != 0) {
                    screen.append(" ");
                } else {
                    screen.append("X");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}