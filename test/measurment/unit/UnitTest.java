package measurment.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {
    
    @Test
    public void shouldConvertTheGivenValueIntoBaseUnit() {
        Unit unit = new Unit(2);
        assertEquals(6,unit.convertToBase(3),0);
    }
    
    @Test
    public void shouldConvertTheGivenValueInBaseToGivenUnit() {
        Unit unit = new Unit(2);
        assertEquals(4,unit.convertFromBase(8),0);
    }
}