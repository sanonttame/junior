package ru.job4j.collection;
import java.util.List;
public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double)list.size() / cells);
        int[][] result = new int[groups][cells];
        int index = 0;
            for (int i = 0; i < groups; i++) {
                for(int j = 0; j < cells; j++) {
                    result[i][j] = list.get(index);
                    index++;
                    if(index >= list.size()) break;
                }
            }

        return result;
    }
}
