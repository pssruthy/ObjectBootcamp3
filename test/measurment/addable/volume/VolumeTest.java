package measurment.addable.volume;

import measurment.ComparisonResult;
import measurment.addabale.volume.Volume;
import measurment.addabale.volume.VolumeUnit;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeTest {
    
    @Test
    public void shouldCompareGivenVolumeInLiterAndGallonAreEqual() {
        Volume gallon = new Volume(1.0, VolumeUnit.GALLON);
        Volume liter = new Volume(3.78, VolumeUnit.LITER);
        Assert.assertEquals(ComparisonResult.EQUAL, gallon.compareTo(liter));
    }
    
    @Test
    public void shouldCompareGivenVolumeInLiterIsGreaterThanGallon() {
        Volume gallon = new Volume(1.0, VolumeUnit.GALLON);
        Volume liter = new Volume(4, VolumeUnit.LITER);
        assertEquals(ComparisonResult.GREATER, liter.compareTo(gallon));
    }
    
    @Test
    public void shouldCompareGivenVolumeInLiterIsLesserThanGallon() {
        Volume gallon = new Volume(1.0, VolumeUnit.GALLON);
        Volume liter = new Volume(2, VolumeUnit.LITER);
        assertEquals(ComparisonResult.LESSER, liter.compareTo(gallon));
    }
    
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
