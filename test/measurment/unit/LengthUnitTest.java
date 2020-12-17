package measurment.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthUnitTest {
    @Test
    public void shouldConvertTheGivenLengthInToBaseUnit() {
        assertEquals(24, LengthUnit.FEET.convertToBase(2), 0);
    }
    
    @Test
    public void shouldConvertTheGivenLengthInBaseUnitToGivenUnit() {
        assertEquals(1, LengthUnit.FEET.convertFromBase(12), 0);
    }
}