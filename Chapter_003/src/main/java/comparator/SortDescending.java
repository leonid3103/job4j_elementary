package comparator;

import tracker.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDescending implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return second.getId().compareTo(first.getId());
    }
    }
