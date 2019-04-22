package ru.job4j.converter;

public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value Евро.
     * @return Рубли.
     */
    public int euroToRub(int value) {
        return value * 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value Доллары.
     * @return Рубли
     */
    public int dollarToRub(int value) {
        return value * 60;
    }
}

