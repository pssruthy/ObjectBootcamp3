package measurment;

import measurment.unit.LengthUnit;
import measurment.unit.TemperatureUnit;
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
    
    @Test
    public void shouldCompareGivenTemperaturesInFahrenheitAndCelsiusAreEqual() {
        Quantity<TemperatureUnit> fahrenheit = new Quantity<>(212, TemperatureUnit.FAHRENHEIT);
        Quantity<TemperatureUnit> celsius = new Quantity<>(100, TemperatureUnit.CELSIUS);
        assertEquals(ComparisonResult.EQUAL, fahrenheit.compareTo(celsius));
    }
    
    @Test
    public void shouldCompareGivenTemperaturesInFahrenheitGreaterThanCelsius() {
        Quantity<TemperatureUnit> fahrenheit = new Quantity<>(300, TemperatureUnit.FAHRENHEIT);
        Quantity<TemperatureUnit> celsius = new Quantity<>(100, TemperatureUnit.CELSIUS);
        assertEquals(ComparisonResult.GREATER, fahrenheit.compareTo(celsius));
    }
}
