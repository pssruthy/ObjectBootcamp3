package measurment;

import measurment.unit.VolumeUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeTest {
    
    @Test
    public void shouldAddTwoVolumeInSameUnit() {
        Volume liter1 = new Volume(1, VolumeUnit.LITER);
        Volume liter2 = new Volume(1, VolumeUnit.LITER);
        assertEquals(new Volume(2,VolumeUnit.LITER),liter1.add(liter2));
    }
    
    @Test
    public void shouldAddTwoVolumeInDifferentUnits() {
        Volume gallon = new Volume(1, VolumeUnit.GALLON);
        Volume liter = new Volume(3.78, VolumeUnit.LITER);
        assertEquals(new Volume(7.56,VolumeUnit.LITER),gallon.add(liter));
    }
}
