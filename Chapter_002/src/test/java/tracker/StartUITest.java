package tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void addNewItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
    @Test
    public void replaceName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item next = new Item("test2");
        next.setId(item.getId());
        tracker.replace(item.getId(), next);
        assertThat(tracker.findById(item.getId()).getName(), is("test2"));
    }
    @Test
    public void deleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        Item itemdel = new Item("test2");
        tracker.add(item);
        tracker.add(itemdel);
        tracker.delete(itemdel.getId());
        Item[] expected = {item};
        assertThat(tracker.findAll(), is(expected));
    }
    @Test
    public void findItemById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }
    @Test
    public void findItemByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }
        @Test
        public void findAll() {
            Tracker tracker = new Tracker();
            Item item = new Item("test1");
            tracker.add(item);
            Item[] expected = {item};
            assertThat(tracker.findAll(), is(expected));
        }
    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {action });
        assertThat(action.isCall(), is(true));
    }
    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {action });
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }

        @Test
        public void findAllActionTest() {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            PrintStream def = System.out;
            System.setOut(new PrintStream(out));
            Tracker tracker = new Tracker();
            Item item = new Item("fix bug");
            tracker.add(item);
            FindAction act = new FindAction();
            act.execute(new StubInput(new String[] {}), tracker);
            String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                    .add(item.getId() + " " + item.getName())
                    .toString();
            assertThat(new String(out.toByteArray()), is(expect));
            System.setOut(def);
        }
    @Test
    public void findByNameTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        FindNameAction act = new FindNameAction();
        act.execute(new StubInput(new String[] {"fix bug"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Введите имя заявки: " + "Имя: " + item.getName() + " id: " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }

}