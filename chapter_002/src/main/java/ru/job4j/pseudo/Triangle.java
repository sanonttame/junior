package ru.job4j.pseudo;
/**
 * @author Anton Narayan
 * @version 0.1
 */
public class Triangle implements Shape {
    /**
     * Метод строит всевдо-треугольник .
     * @return строка
     */
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("   *   ");
        pic.append("  ***  ");
        pic.append(" ***** ");
        pic.append("*******");
        return pic.toString();
    }
}
