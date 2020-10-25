package converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(1);
        assertThat(result, is(70));
    }

    @Test
    public void when70RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(1);
        assertThat(result, is(60));
    }
	    @Test
    public void when1DollarToRubleThen60() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(600);
        assertThat(result, is(10));
    }
	    @Test
    public void when1EuroToRubleThen70() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(700);
        assertThat(result, is(10));
    }
}