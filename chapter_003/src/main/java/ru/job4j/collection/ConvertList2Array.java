package ru.job4j.collection;
import java.util.List;
class ConvertList2Array {
    static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] result = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            result[row][cell] = num;
            cell++;
            if (cell == cells) {
                row++;
                cell = 0;
            }
        }

        return result;
    }
}
