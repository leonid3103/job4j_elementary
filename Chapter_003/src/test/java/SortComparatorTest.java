
import comparator.SortAscending;
import comparator.SortDescending;
import org.junit.Assert;
import org.junit.Test;
import tracker.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class SortComparatorTest {
    @Test
    public void sortAscendingTest() {
        List<Item> items = new ArrayList<Item>();
        Tracker tracker;
        tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.createItem(item1);
        tracker.createItem(item2);
        tracker.createItem(item3);
        item1.setId("12500");
        item2.setId("13000");
        item3.setId("-2000");
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Collections.sort(items, new SortAscending());
        System.out.println(items);
        assertThat("-2000", is(items.get(0).getId()));
    }

    @Test
    public void sortDescendingTest() {
        List<Item> items = new ArrayList<Item>();
        Tracker tracker;
        tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.createItem(item1);
        tracker.createItem(item2);
        tracker.createItem(item3);
        item1.setId("12500");
        item2.setId("13000");
        item3.setId("-2000");
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Collections.sort(items, new SortDescending());
        System.out.println(items);
        assertThat("13000", is(items.get(0).getId()));
    }
}