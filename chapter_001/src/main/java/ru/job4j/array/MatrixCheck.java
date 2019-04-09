package ru.job4j.array;

/**
 * Класс проверяющий булевское значение по диагонали массива
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * метод проверяющий диагональ
     * @param data массив
     * @return true or false
     */
    public boolean mono(boolean[][] data){
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++){
            if (data[i][i] != data[i + 1][i + 1] || data[i][data.length - 1 - i] != data[i + 1][data.length - 2 - i]) {
                result = false;
                break;
                }
        }
        return result;
    }
}
