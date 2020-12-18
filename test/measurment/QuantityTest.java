package measurment;

import measurment.addabale.length.LengthUnit;
import measurment.temperature.TemperatureUnit;
import measurment.addabale.volume.VolumeUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuantityTest {
    @Test
    public void shouldCompareGivenTwoQuantitiesAreEqual() {
        Quantity<VolumeUnit> gallon = new Quantity<>(1.0, VolumeUnit.GALLON);
        Quantity<VolumeUnit> liter = new Quantity<>(3.78, VolumeUnit.LITER);
        assertEquals(ComparisonResult.EQUAL, gallon.compareTo(liter));
    }
    
    @Test
    public void shouldCompareFirstQuantityIsGreaterThanOther() {
        Quantity<LengthUnit> feet = new Quantity<>(1, LengthUnit.FEET);
        Quantity<LengthUnit> inch = new Quantity<>(10, LengthUnit.INCH);
        assertEquals(ComparisonResult.GREATER, feet.compareTo(inch));
    }
    
    @Test
    public void shouldCompareFirstQuantityIsLesserThanOther() {
        Quantity<TemperatureUnit> fahrenheit = new Quantity<>(100, TemperatureUnit.FAHRENHEIT);
        Quantity<TemperatureUnit> celsius = new Quantity<>(100, TemperatureUnit.CELSIUS);
        assertEquals(ComparisonResult.LESSER, fahrenheit.compareTo(celsius));
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
