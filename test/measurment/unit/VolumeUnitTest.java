package measurment.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeUnitTest {
    @Test
    public void shouldConvertTheGivenVolumeInToBaseUnit() {
        assertEquals(7.56, VolumeUnit.GALLON.convertToBase(2), 0);
    }
    
    @Test
    public void shouldConvertTheVolumeInBaseToGivenUnit() {
        assertEquals(1, VolumeUnit.GALLON.convertFromBase(3.78), 0);
    }
}