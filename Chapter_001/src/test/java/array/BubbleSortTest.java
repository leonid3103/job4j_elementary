package array;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
        @Test
        public void whenStartWithPrefixThenTrue() {
            BubbleSort bubbleSort = new BubbleSort();
            int[] input = new int[] {4, 1, 5, 6, 7, 9, 8, 2, 3, 10};
            int[] result = bubbleSort.sort(input);
            int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            assertThat(result, is(expect));
        }
}
