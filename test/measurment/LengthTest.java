package measurment;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void shouldCompareGivenLengthInInchAndFeetAreEqual() {
        Length lengthInFeet = new Length(1, LengthUnit.FEET);
        Length lengthInInch = new Length(12, LengthUnit.INCH);
        assertEquals(ComparisonResult.EQUAL,lengthInFeet.compareTo(lengthInInch));
    }
    
    @Test
    public void shouldCompareGivenLengthInInchAndFeetAreNotEqual() {
        Length lengthInFeet = new Length(2, LengthUnit.FEET);
        Length lengthInInch = new Length(12, LengthUnit.INCH);
        assertEquals(ComparisonResult.LESSER,lengthInFeet.compareTo(lengthInInch));
    }
    
    @Test
    public void shouldCompareGivenLengthsInCentimeterAndInchAreEqual() {
        Length lengthInCM = new Length(5, LengthUnit.CENTIMETER);
        Length lengthInInches = new Length(2, LengthUnit.INCH);
        assertEquals(ComparisonResult.EQUAL,lengthInCM.compareTo(lengthInInches));
    }
    
    @Test
    public void shouldCompareGivenLengthInInchAndCentimeterAreNotEqual() {
        Length lengthInCM = new Length(2, LengthUnit.CENTIMETER);
        Length lengthInInch = new Length(12, LengthUnit.INCH);
        assertEquals(ComparisonResult.GREATER,lengthInCM.compareTo(lengthInInch));
    }
    
    @Test
    public void shouldCompareGivenLengthInCentimeterAndMillimeterAreEqual() {
        Length lengthInCM = new Length(1, LengthUnit.CENTIMETER);
        Length lengthInMM = new Length(10, LengthUnit.MILLIMETER);
        assertEquals(ComparisonResult.EQUAL,lengthInCM.compareTo(lengthInMM));
    }
    
    @Test
    public void shouldCompareGivenLengthInCentimeterAndMillimeterAreNotEqual() {
        Length lengthInCM = new Length(2, LengthUnit.CENTIMETER);
        Length lengthInMM = new Length(10, LengthUnit.MILLIMETER);
        assertEquals(ComparisonResult.LESSER,lengthInCM.compareTo(lengthInMM));
    }

    @Test
    public void shouldAddTwoGivenLengthsInInches() {
        Length length1 = new Length(2, LengthUnit.INCH);
        Length length2 = new Length(1, LengthUnit.INCH);
        Length expected = new Length(3, LengthUnit.INCH);
        assertEquals(expected, length1.add(length2));
    }
}
