package measurment;

import measurment.unit.LengthUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthTest {
    
    @Test
    public void shouldCompareGivenLengthInInchAndFeetAreEqual() {
        Length feet = new Length(1, LengthUnit.FEET);
        Length inch = new Length(12, LengthUnit.INCH);
        assertEquals(ComparisonResult.EQUAL, feet.compareTo(inch));
    }
    
    @Test
    public void shouldCompareGivenLengthInCentimeterIsGreaterThanInch() {
        Length inch = new Length(1, LengthUnit.INCH);
        Length cm = new Length(4, LengthUnit.CENTIMETER);
        assertEquals(ComparisonResult.GREATER, cm.compareTo(inch));
    }
    
    @Test
    public void shouldCompareGivenLengthInCentimeterIsLesserThanMillimeters() {
        Length cm = new Length(1, LengthUnit.CENTIMETER);
        Length mm = new Length(20, LengthUnit.MILLIMETER);
        assertEquals(ComparisonResult.LESSER, cm.compareTo(mm));
    }
    
    @Test
    public void shouldAddTwoLengthInSameUnit() {
        Length inch1 = new Length(1, LengthUnit.INCH);
        Length inch2 = new Length(1, LengthUnit.INCH);
        assertEquals(new Length(2,LengthUnit.INCH),inch1.add(inch2));
    }
    
    @Test
    public void shouldAddTwoLengthInDifferentUnits() {
        Length feet = new Length(1, LengthUnit.FEET);
        Length inch2 = new Length(12, LengthUnit.INCH);
        assertEquals(new Length(24,LengthUnit.INCH),feet.add(inch2));
    }
}
