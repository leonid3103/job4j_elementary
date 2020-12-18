package comparator;

import tracker.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAscending implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return first.getId().compareTo(second.getId());
    }
    }
