package measurment;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LengthTest {
    @Test
    public void shouldCompareGivenLengthInInchAndFeetAreEqual() {
        Length lengthInFeet = new Length(1, Unit.FEET);
        Length lengthInInch = new Length(12, Unit.INCH);
        assertTrue(lengthInFeet.compareTo(lengthInInch));
    }
    
    @Test
    public void shouldCompareGivenLengthInInchAndFeetAreNotEqual() {
        Length lengthInFeet = new Length(2, Unit.FEET);
        Length lengthInInch = new Length(12, Unit.INCH);
        assertFalse(lengthInFeet.compareTo(lengthInInch));
    }
    
    @Test
    public void shouldCompareGivenLengthsInCentimeterAndInchAreEqual() {
        Length lengthInCM = new Length(5, Unit.CENTIMETER);
        Length lengthInInches = new Length(2, Unit.INCH);
        assertTrue(lengthInCM.compareTo(lengthInInches));
    }
    
    @Test
    public void shouldCompareGivenLengthInInchAndCentimeterAreNotEqual() {
        Length lengthInCM = new Length(2, Unit.CENTIMETER);
        Length lengthInInch = new Length(12, Unit.INCH);
        assertFalse(lengthInCM.compareTo(lengthInInch));
    }
}
