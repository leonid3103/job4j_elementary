package tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(0, new CreateAction());
        actions.add(1, new ExitAction());
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Input in = new StubInput(
                new String[]{"0", "123456", "1"});
        Item item = tracker.createItem(new Item("delete"));
        item.setId("123456");
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(0, new DeleteAction());
        actions.add(1, new ExitAction());
        new StartUI().init(in, tracker, actions);
        assertThat(true, is(tracker.findAll().isEmpty()));
    }

    @Test
    public void whenFindItems() {
        Tracker tracker = new Tracker();
        Input in = new StubInput(
                new String[]{"0", "1"});
        Item item = tracker.createItem(new Item("findAll"));
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(0, new FindAction());
        actions.add(1, new ExitAction());
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("findAll"));
    }

    @Test
    public void whenFindName() {
        Tracker tracker = new Tracker();
        Input in = new StubInput(
                new String[]{"0", "findName", "1"});
        Item item = tracker.createItem(new Item("findName"));
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(0, new FindNameAction());
        actions.add(1, new ExitAction());
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("findName"));
    }

    @Test
    public void whenFindId() {
        Tracker tracker = new Tracker();
        Input in = new StubInput(
                new String[]{"0", "12345", "1"});
        Item item = tracker.createItem(new Item("findId"));
        item.setId("12345");
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(0, new FindIDAction());
        actions.add(1, new ExitAction());
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getId(), is(item.getId()));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Input in = new StubInput(
                new String[]{"0", "name", "name2", "1234", "1"});
        Item item = tracker.createItem(new Item("name"));
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(0, new ReplaceAction());
        actions.add(1, new ExitAction());
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("name2"));

    }
}