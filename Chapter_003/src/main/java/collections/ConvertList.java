package collections;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        for (int[] row : in) {
            for (int cell : row) {
                rsl.add(cell);
            }

    }
         return rsl;
} }
