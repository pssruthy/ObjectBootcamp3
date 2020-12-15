package measurment;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {
    @Test
    public void shouldConvertTheGivenFeetToCentimeter() {
        assertEquals(30, Unit.FEET.convertToStandard(1), 0);
    }
    
    @Test
    public void shouldConvertTheGivenInchToCentimeter() {
        assertEquals(5, Unit.INCH.convertToStandard(2), 0);
    }
}