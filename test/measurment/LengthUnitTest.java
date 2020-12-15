package measurment;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthUnitTest {
    @Test
    public void shouldConvertTheGivenFeetToCentimeter() {
        assertEquals(30, LengthUnit.FEET.convertToStandard(1), 0);
    }
    
    @Test
    public void shouldConvertTheGivenInchToCentimeter() {
        assertEquals(5, LengthUnit.INCH.convertToStandard(2), 0);
    }
}