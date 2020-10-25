package array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayDuplicate words = new ArrayDuplicate();
        String[] input = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = words.remove(input);
        String[] expect = new String[]{"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
     }

     }
