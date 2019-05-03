package ru.job4j.pseudo;

/**
 * @author Anton Narayan
 * @version 0.1
 */
public class Square implements Shape {
    /**
     * Метод строит всевдо-квадрат .
     * @return строка
     */
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("++++");
        pic.append("++++");
        pic.append("++++");
        pic.append("++++");
        return pic.toString();
    }
}
