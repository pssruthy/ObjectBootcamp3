package measurment.volume;

import measurment.volume.VolumeUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeUnitTest {

    @Test
    public void shouldConvertTheGivenGallonToLiter() {
        assertEquals(3.78, VolumeUnit.GALLON.convertToStandard(1), 0);
    }
    
    @Test
    public void shouldConvertTheVolumeToGivenUnit() {
        assertEquals(2,VolumeUnit.GALLON.convertTo(2,VolumeUnit.GALLON),0);
    }
}