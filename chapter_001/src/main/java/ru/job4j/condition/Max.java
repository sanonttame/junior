package ru.job4j.condition;
/**
 * Максимальное значение 3х чисел..
 * @author Anton Narayan
 * @version 0.2
 * @since 0.1
 */
public class Max {
    public int max(int first, int second) {

        return first > second ? first : second;
    }
    public int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = result > third ? result : third;
        return result;

    }
}
