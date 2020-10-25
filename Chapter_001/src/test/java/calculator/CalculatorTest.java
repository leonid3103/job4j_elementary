package calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
}
	@Test
    public void whenDiv2On2Then1() {
    Calculator calc = new Calculator();
    double result = calc.div(2D, 2D);
    double expected = 1D;
    assertThat(result, is(expected));
}
	@Test
    public void whenSub2On2Then1() {
    Calculator calc = new Calculator();
    double result = calc.subtract(2D, 1D);
    double expected = 1D;
    assertThat(result, is(expected));
}
	@Test
    public void whenMult2On2Then1() {
    Calculator calc = new Calculator();
    double result = calc.multiple(2D, 1D);
    double expected = 2D; 
    assertThat(result, is(expected));
}
}
