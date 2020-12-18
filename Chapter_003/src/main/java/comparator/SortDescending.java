package comparator;

import tracker.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDescending implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        int first = Integer.parseInt(o1.getId());
        int second = Integer.parseInt(o2.getId());
        if (first == second) {
            return 0;
        } else if (first < second) {
            return 1;
        } else {
            return -1;
    }
    }
}
