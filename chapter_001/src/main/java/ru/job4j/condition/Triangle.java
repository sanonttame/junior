package ru.job4j.condition;
/**
 * Вычисление площади треугольника.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    /**
     * Конструктор, который принимает начальное состояние объекта "Треугольник"
     *
     * @param ap первая точка
     * @param bp вторая точка
     * @param cp третья точка
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
        /**
         * Метод вычисления периметра по длинам сторон.
         *
         * Формула.
         *
         * (a + b + c) / 2
         *
         * @param a расстояние между точками a b
         * @param b расстояние между точками a c
         * @param c расстояние между точками b c
         * @return Перимент.
         */
        private double period(double a, double b, double c) {
            return (a + b + c) / 2;
        }

        /**
         * Метод должен вычислить прощадь треугольканива.
         *
         * Формула.
         *
         * √ p *(p - ab) * (p - ac) * (p - bc)
         *
         * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
         *
         * @return Вернуть прощадь, если треугольник существует или -1.
         */
        public double area() {
            double rsl = -1;
            double a = first.distance(second);
            double b = first.distance(third);
            double c = second.distance(third);
            double p = period(a, b, c);
            if (this.exist(a, b, c)) {
                rsl = Math.sqrt(p * (p - a) * (p - c) * (p - b));
            }
            return rsl;
        }

        /**
         * Метод проверяет можно ли построить треугольник с такими длинами сторон.
         *
         * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
         *
         * @param a Длина от точки a b.
         * @param b Длина от точки a c.
         * @param c Длина от точки b c.
         * @return да или нет
         */
        private boolean exist(double a, double c, double b) {
            return a + b > c && b + c > a && a + c > b;
        }
    }
