package array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class FindloopTest {

        @Test
        public void whenArrayHas5Then0() {
            Findloop find = new Findloop();
            int[] input = new int[] {5, 10, 3};
            int value = 5;
            int result = find.indexOf(input, value);
            int expect = 0;
            assertThat(result, is(expect));
        }
        @Test
        public void whenArrayHas6Then0() {
            Findloop find = new Findloop();
            int[] input = new int[] {1, 10, 3};
            int value = 5;
            int result = find.indexOf(input, value);
            int expect = -1;
            assertThat(result, is(expect));
        }
        @Test
        public void whenArrayHas7Then0() {
            Findloop find = new Findloop();
            int[] input = new int[] {10, 5};
            int value = 5;
            int result = find.indexOf(input, value);
            int expect = 1;
            assertThat(result, is(expect));
        }
    }
