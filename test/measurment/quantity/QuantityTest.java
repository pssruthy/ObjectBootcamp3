package measurment.quantity;

import measurment.ComparisonResult;
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
}
