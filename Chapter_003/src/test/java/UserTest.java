import comparator.User;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenCompareDiffName() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareEqualName() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Petr", 36)
                );
        assertThat(rsl, lessThan(0));
    }

}
