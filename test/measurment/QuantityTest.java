package measurment;

import measurment.unit.LengthUnit;
import measurment.unit.VolumeUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuantityTest {
    @Test
    public void shouldCompareGivenVolumeInLiterAndGallonAreEqual() {
        Quantity<VolumeUnit> gallon = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> liter = new Quantity<>(3.78, VolumeUnit.LITER);
        assertEquals(ComparisonResult.EQUAL, gallon.compareTo(liter));
    }
    
    @Test
    public void shouldCompareGivenVolumeInLiterIsGreaterThanGallon() {
        Quantity<VolumeUnit> gallon = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> liter = new Quantity<>(4, VolumeUnit.LITER);
        assertEquals(ComparisonResult.GREATER, liter.compareTo(gallon));
    }
    
    @Test
    public void shouldCompareGivenVolumeInLiterIsLesserThanGallon() {
        Quantity<VolumeUnit> gallon = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> liter = new Quantity<>(2, VolumeUnit.LITER);
        assertEquals(ComparisonResult.LESSER, liter.compareTo(gallon));
    }
    
    @Test
    public void shouldCompareGivenLengthInFeetIsGreaterThanInch() {
        Quantity<LengthUnit> feet = new Quantity<>(1, LengthUnit.FEET);
        Quantity<LengthUnit> inch = new Quantity<>(10, LengthUnit.INCH);
        assertEquals(ComparisonResult.GREATER, feet.compareTo(inch));
    }
    
    @Test
    public void shouldCompareGivenLengthInInchIsLesserThanCentimeter() {
        Quantity<LengthUnit> cm = new Quantity<>(6, LengthUnit.CENTIMETER);
        Quantity<LengthUnit> inch = new Quantity<>(2, LengthUnit.INCH);
        assertEquals(ComparisonResult.LESSER, inch.compareTo(cm));
    }
    
    @Test
    public void shouldCompareGivenLengthInCentimeterAndMillimeterAreEqual() {
        Quantity<LengthUnit> cm = new Quantity<>(1, LengthUnit.CENTIMETER);
        Quantity<LengthUnit> mm = new Quantity<>(10, LengthUnit.MILLIMETER);
        assertEquals(ComparisonResult.EQUAL, mm.compareTo(cm));
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
        Quantity<LengthUnit> inch1 = new Quantity<>(1, LengthUnit.INCH);
        Quantity<LengthUnit> inch2 = new Quantity<>(2, LengthUnit.INCH);
        Quantity<LengthUnit> expected = new Quantity<>(3, LengthUnit.INCH);
        assertEquals(expected, inch1.add(inch2, LengthUnit.INCH));
    }
    
    @Test
    public void shouldAddTwoDifferentQuantitiesInLength() {
        Quantity<LengthUnit> centiMeter = new Quantity<>(2.5, LengthUnit.CENTIMETER);
        Quantity<LengthUnit> inch = new Quantity<>(2, LengthUnit.INCH);
        Quantity<LengthUnit> expected = new Quantity<>(3, LengthUnit.INCH);
        assertEquals(expected, centiMeter.add(inch, LengthUnit.INCH));
    }
    
    @Test
    public void shouldEquateWhenTwoQuantitiesAreEqual() {
        Quantity<LengthUnit> quantity1 = new Quantity<>(1, LengthUnit.INCH);
        Quantity<LengthUnit> quantity2 = new Quantity<>(1, LengthUnit.INCH);
        assertEquals(quantity1,quantity2);
    }
    
    @Test
    public void shouldNotEquateWhenUnitOfTwoQuantitiesAreDifferent() {
        Quantity<LengthUnit> quantity1 = new Quantity<>(1, LengthUnit.INCH);
        Quantity<LengthUnit> quantity2 = new Quantity<>(1, LengthUnit.CENTIMETER);
        assertNotEquals(quantity1, quantity2);
    }
    
    @Test
    public void shouldNotEquateWhenValueOfTwoQuantitiesAreDifferent() {
        Quantity<LengthUnit> quantity1 = new Quantity<>(1, LengthUnit.INCH);
        Quantity<LengthUnit> quantity2 = new Quantity<>(2, LengthUnit.INCH);
        assertNotEquals(quantity1, quantity2);
    }
}
