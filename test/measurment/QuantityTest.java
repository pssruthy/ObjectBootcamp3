package measurment;

import measurment.unit.LengthUnit;
import measurment.unit.VolumeUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantityTest {
    @Test
    public void shouldCompareGivenVolumeInLiterAndGallonAreEqual() {
        Quantity<VolumeUnit> quantityInGallon = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> quantityInLiter = new Quantity<>(3.78, VolumeUnit.LITER);
        assertEquals(ComparisonResult.EQUAL, quantityInGallon.compareTo(quantityInLiter));
    }
    
    @Test
    public void shouldCompareGivenVolumeInLiterIsGreaterThanGallon() {
        Quantity<VolumeUnit> quantityInGallon = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> quantityInLiter = new Quantity<>(4, VolumeUnit.LITER);
        assertEquals(ComparisonResult.GREATER, quantityInLiter.compareTo(quantityInGallon));
    }
    
    @Test
    public void shouldCompareGivenVolumeInLiterIsLesserThanGallon() {
        Quantity<VolumeUnit> quantityInGallon = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> quantityInLiter = new Quantity<>(2, VolumeUnit.LITER);
        assertEquals(ComparisonResult.LESSER, quantityInLiter.compareTo(quantityInGallon));
    }
    
    @Test
    public void shouldAddTwoSameQuantitiesInVolume() {
        Quantity<VolumeUnit> gallon1 = new Quantity<>(1, VolumeUnit.GALLON);
        Quantity<VolumeUnit> gallon2 = new Quantity<>(2, VolumeUnit.GALLON);
        Quantity<VolumeUnit> expected = new Quantity<>(11.34, VolumeUnit.LITER);
        assertEquals(expected, gallon1.add(gallon2,VolumeUnit.LITER));
    }
    
    @Test
    public void shouldAddTwoDifferentQuantitiesInVolume() {
        Quantity<VolumeUnit> gallon = new Quantity<>(1, VolumeUnit.GALLON);
        Quantity<VolumeUnit> liter = new Quantity<>(1, VolumeUnit.LITER);
        Quantity<VolumeUnit> expected = new Quantity<>(4.78, VolumeUnit.LITER);
        assertEquals(expected, gallon.add(liter, VolumeUnit.LITER));
    }
    
    @Test
    public void shouldAddTwoSameQuantitiesInLength() {
        Quantity<LengthUnit> length1 = new Quantity<>(1, LengthUnit.INCH);
        Quantity<LengthUnit> length2 = new Quantity<>(2, LengthUnit.INCH);
        Quantity<LengthUnit> expected = new Quantity<>(3, LengthUnit.INCH);
        assertEquals(expected, length1.add(length2, LengthUnit.INCH));
    }
    
    @Test
    public void shouldAddTwoDifferentQuantitiesInLength() {
        Quantity<LengthUnit> centiMeter = new Quantity<>(2.5, LengthUnit.CENTIMETER);
        Quantity<LengthUnit> inch = new Quantity<>(2, LengthUnit.INCH);
        Quantity<LengthUnit> expected = new Quantity<>(3, LengthUnit.INCH);
        assertEquals(expected, centiMeter.add(inch, LengthUnit.INCH));
    }
}
