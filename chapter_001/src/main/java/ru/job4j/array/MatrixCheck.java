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
            for (int j = 0; j < data.length - 1; j++){
                if(data[i][j] != data[i +1 ][j + 1]) {
                    result = false;
                }
            }
        }
        return result;
    }
}
