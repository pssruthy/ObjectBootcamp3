package measurment;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void shouldCompareGivenLengthInInchAndFeetAreEqual() {
        Length lengthInFeet = new Length(1, Unit.FEET);
        Length lengthInInch = new Length(12, Unit.INCH);
        assertEquals(ComparisonResult.EQUAL,lengthInFeet.compareTo(lengthInInch));
    }
    
    @Test
    public void shouldCompareGivenLengthInInchAndFeetAreNotEqual() {
        Length lengthInFeet = new Length(2, Unit.FEET);
        Length lengthInInch = new Length(12, Unit.INCH);
        assertEquals(ComparisonResult.LESSER,lengthInFeet.compareTo(lengthInInch));
    }
    
    @Test
    public void shouldCompareGivenLengthsInCentimeterAndInchAreEqual() {
        Length lengthInCM = new Length(5, Unit.CENTIMETER);
        Length lengthInInches = new Length(2, Unit.INCH);
        assertEquals(ComparisonResult.EQUAL,lengthInCM.compareTo(lengthInInches));
    }
    
    @Test
    public void shouldCompareGivenLengthInInchAndCentimeterAreNotEqual() {
        Length lengthInCM = new Length(2, Unit.CENTIMETER);
        Length lengthInInch = new Length(12, Unit.INCH);
        assertEquals(ComparisonResult.LESSER,lengthInCM.compareTo(lengthInInch));
    }
    
    @Test
    public void shouldCompareGivenLengthInCentimeterAndMillimeterAreEqual() {
        Length lengthInCM = new Length(1, Unit.CENTIMETER);
        Length lengthInMM = new Length(10, Unit.MILLIMETER);
        assertEquals(ComparisonResult.EQUAL,lengthInCM.compareTo(lengthInMM));
    }
    
    @Test
    public void shouldCompareGivenLengthInCentimeterAndMillimeterAreNotEqual() {
        Length lengthInCM = new Length(2, Unit.CENTIMETER);
        Length lengthInMM = new Length(10, Unit.MILLIMETER);
        assertEquals(ComparisonResult.LESSER,lengthInCM.compareTo(lengthInMM));
    }
}
