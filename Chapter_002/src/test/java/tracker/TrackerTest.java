package tracker;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class TrackerTest {

    @Test
    public void addTest() {
        Tracker tracker;
        tracker = new Tracker();
        Item item = new Item("test1");
        tracker.createItem(item);
        tracker.findByName(item.getName());
        assertThat("test1", is(item.getName()));
    }

    @Test
    public void findByIDTest() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        tracker.createItem(item1);
        Item result = tracker.findById(item1.getId());
            assertThat(result.getId(), is(item1.getId()));
    }

    @Test
    public void findByNameTest() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        tracker.createItem(item1);
        Item item2 = new Item("test2");
        tracker.createItem(item2);
        Item result = tracker.findByName("test1");
            assertThat(result.getName(), is("test1"));
        }

    @Test
    public void findAllTest() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        tracker.createItem(item1);
        Item item2 = new Item("test2");
        tracker.createItem(item2);
        List<Item> result = new ArrayList<Item>();
        result.add(item1);
        result.add(item2);
        assertThat(tracker.findAll(), is(result));
    }

    @Test
    public void deleteTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.createItem(item);
        boolean result = tracker.delete(item.getId());
        assertThat(result, is(true));
    }

    @Test
    public void replaceTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.createItem(item);
        tracker.replace("test1", "1234", "test2");
        assertThat(tracker.findAll().get(0).getName(), is("test2"));
    }
}
