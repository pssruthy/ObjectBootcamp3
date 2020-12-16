package measurment.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthUnitTest {
    @Test
    public void shouldConvertTheLengthToSameUnit() {
        assertEquals(2, LengthUnit.INCH.convertTo(2, LengthUnit.INCH), 0);
    }
    
    @Test
    public void shouldConvertTheLengthToGivenUnit() {
        assertEquals(12, LengthUnit.FEET.convertTo(1, LengthUnit.INCH), 0);
    }
}