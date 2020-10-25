package array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UnionArraysTest {
    @Test
    public void mergeTest() {
        UnionArrays mArray = new UnionArrays();
        int[] a = new int[]{1, 3, 5};
        int[] b = new int[]{2, 4, 6};
        int[] result = mArray.merge(a, b);
        int[] expect = new int[]{1, 2, 3, 4, 5, 6};
        assertThat(result, is(expect));
    }
    }

