package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ConvertMatrix2List {

    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
    } return list;
}
}
