package measurment.length;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthUnitTest {
    @Test
    public void shouldConvertTheGivenFeetToCentimeter() {
        assertEquals(12, LengthUnit.FEET.convertToStandard(1), 0);
    }
    
    @Test
    public void shouldConvertTheGivenInchToCentimeter() {
        assertEquals(2, LengthUnit.INCH.convertToStandard(2), 0);
    }
}