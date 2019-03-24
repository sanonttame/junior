package Converter;

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
        return value/ 60;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value Евро.
     * @return Рубли.
     */
    public int EuroTuRub(int value) {
        return value * 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value Доллары.
     * @return Рубли
     */
    public int DollartoRub(int value) {
        return value * 60;
    }
}

