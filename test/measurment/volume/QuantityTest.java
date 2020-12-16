package measurment.volume;

import measurment.ComparisonResult;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantityTest {
    @Test
    public void shouldCompareGivenVolumeInLiterAndGallonAreEqual() {
        Quantity<VolumeUnit> quantityInGallon = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> quantityInLiter = new Quantity<>(3.78, VolumeUnit.LITER);
        Assert.assertEquals(ComparisonResult.EQUAL, quantityInGallon.compareTo(quantityInLiter));
    }

    @Test
    public void shouldCompareGivenVolumeInLiterIsGreaterThanGallon() {
        Quantity<Number, V> quantityInGallon = new Quantity<Number, V>(1, VolumeUnit.GALLON);
        Quantity<Number, V> quantityInLiter = new Quantity<Number, V>(4, VolumeUnit.LITER);
        assertEquals(ComparisonResult.GREATER, quantityInLiter.compareTo(quantityInGallon));
    }

    @Test
    public void shouldCompareGivenVolumeInGallonIsLesserThanLiter() {
        Quantity<Number, V> quantityInLiter = new Quantity<Number, V>(4, VolumeUnit.LITER);
        Quantity<Number, V> quantityInGallon = new Quantity<Number, V>(1, VolumeUnit.GALLON);
        assertEquals(ComparisonResult.LESSER, quantityInGallon.compareTo(quantityInLiter));
    }
    
    @Test
    public void shouldAddTwoVolumesInSameUnits() {
        Quantity<Number, V> quantityInGallon = new Quantity<Number, V>(1, VolumeUnit.GALLON);
        Quantity<Number, V> quantityInLiter = new Quantity<Number, V>(1, VolumeUnit.GALLON);
        Quantity<Number, V> expected = new Quantity<Number, V>(7.56, VolumeUnit.LITER);
        assertEquals(expected, quantityInGallon.add(quantityInLiter));
    }
    
    @Test
    public void shouldAddTwoVolumesInDifferentUnits() {
        Quantity<Number, V> quantityInGallon = new Quantity<Number, V>(1, VolumeUnit.GALLON);
        Quantity<Number, V> quantityInLiter = new Quantity<Number, V>(1, VolumeUnit.LITER);
        Quantity<Number, V> expected = new Quantity<Number, V>(4.78, VolumeUnit.LITER);
        assertEquals(expected, quantityInGallon.add(quantityInLiter));
    }
}
