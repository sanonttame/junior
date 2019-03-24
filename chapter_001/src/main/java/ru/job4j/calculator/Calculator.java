package ru.job4j.calculator;
/**
* Class for calculate task.
*
* @author Narayan Anton 
* @version 0.1
* @since 0.1
*/
public class Calculator {
    /**
     * Method add.
     *
     * @param first  first
     * @param second second
     */
    public double add(double first, double second) {
                return first + second;
    }
    /**
     * Method sub.
     *
     * @param first  first
     * @param second second
     */
    public double sub(double first, double second) {
        return first - second;
    }
    /**
     * Method multiple.
     *
     * @param first  first
     * @param second second
     */
    public double multiple(double first, double second) {
        return first * second;
    }
    /**
     * Method div.
     *
     * @param first  first
     * @param second second
     */
    public double div(double first, double second) {
        return first / second;
    }
}