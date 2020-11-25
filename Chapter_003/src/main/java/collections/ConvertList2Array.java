package collections;

import java.util.List;

public class ConvertList2Array {

    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0; int cell = 0;
        for (Integer num : list) {
            array[row][cell] = num;
            if (cell == array.length - 1) {
                row++;
            }
            if (array.length - 1 <= cell) {
                cell = 0;
            } else {
                cell++;
            }
        }
        return array;
    }
}