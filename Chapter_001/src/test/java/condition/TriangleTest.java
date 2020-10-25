package condition;

import org.hamcrest.Matchers;
import org.junit.Test;
import point.Point;

import static org.junit.Assert.assertThat;


public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, Matchers.closeTo(expected, 0.1));
    }
    }
