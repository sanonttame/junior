package ru.job4j.array;
/**
 * Класс строящий массив степеней чисел.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class Square {
    /**
     * @param bound количество возведённых в квадрат числе.
     *@return объект массив
     */
    public int[] calculate(int bound){
        int[] result =  new int[bound];
        for (int index = 0; index < result.length; index++){
            result[index] = (int) Math.pow(index + 1, 2);
        }
        return result;
    }
}
