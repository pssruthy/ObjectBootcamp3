package measurment.volume;

import measurment.volume.VolumeUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeUnitTest {

    @Test
    public void shouldConvertTheGivenGallonToLiter() {
        assertEquals(3.78, VolumeUnit.GALLON.convertToStandard(1), 0);
    }
}