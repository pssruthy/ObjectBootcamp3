package measurment.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeUnitTest {
    @Test
    public void shouldConvertTheVolumeToSameUnit() {
        assertEquals(2, VolumeUnit.GALLON.convertTo(2, VolumeUnit.GALLON), 0);
    }
    
    @Test
    public void shouldConvertTheVolumeToGivenUnit() {
        assertEquals(3.78, VolumeUnit.GALLON.convertTo(1, VolumeUnit.LITER), 0);
    }
}