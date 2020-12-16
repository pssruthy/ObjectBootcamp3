package measurment.volume;

import measurment.ComparisonResult;
import measurment.volume.Volume;
import measurment.volume.VolumeUnit;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeTest {
    @Test
    public void shouldCompareGivenVolumeInLiterAndGallonAreEqual() {
        Volume volumeInGallon = new Volume(1, VolumeUnit.GALLON);
        Volume volumeInLiter = new Volume(3.78, VolumeUnit.LITER);
        Assert.assertEquals(ComparisonResult.EQUAL, volumeInGallon.compareTo(volumeInLiter));
    }

    @Test
    public void shouldCompareGivenVolumeInLiterIsGreaterThanGallon() {
        Volume volumeInGallon = new Volume(1, VolumeUnit.GALLON);
        Volume volumeInLiter = new Volume(4, VolumeUnit.LITER);
        assertEquals(ComparisonResult.GREATER, volumeInLiter.compareTo(volumeInGallon));
    }

    @Test
    public void shouldCompareGivenVolumeInGallonIsLesserThanLiter() {
        Volume volumeInLiter = new Volume(4, VolumeUnit.LITER);
        Volume volumeInGallon = new Volume(1, VolumeUnit.GALLON);
        assertEquals(ComparisonResult.LESSER, volumeInGallon.compareTo(volumeInLiter));
    }
    
    @Test
    public void shouldAddTwoVolumesInSameUnits() {
        Volume volumeInGallon = new Volume(1, VolumeUnit.GALLON);
        Volume volumeInLiter = new Volume(1, VolumeUnit.GALLON);
        Volume expected = new Volume(7.56, VolumeUnit.LITER);
        assertEquals(expected,volumeInGallon.add(volumeInLiter));
    }
    
    @Test
    public void shouldAddTwoVolumesInDifferentUnits() {
        Volume volumeInGallon = new Volume(1, VolumeUnit.GALLON);
        Volume volumeInLiter = new Volume(1, VolumeUnit.LITER);
        Volume expected = new Volume(4.78, VolumeUnit.LITER);
        assertEquals(expected,volumeInGallon.add(volumeInLiter));
    }
}
