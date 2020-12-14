package measurment;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LengthTest {
    @Test
    public void shouldCompareGivenInchAndFeetAreEqual() {
        Length lengthInFeet = new Length(1, Unit.FEET);
        Length lengthInInches = new Length(12, Unit.INCH);
        assertTrue(lengthInFeet.compareTo(lengthInInches));
    }

    @Test
    public void shouldCompareGivenInchAndFeetAreNotEqual() {
        Length lengthInFeet = new Length(2, Unit.FEET);
        Length lengthInInches = new Length(12, Unit.INCH);
        assertFalse(lengthInFeet.compareTo(lengthInInches));
    }

    @Test
    public void shouldCompareGivenLengthsInCentimeterAndInchesAreEqual() {
        Length lengthInCM = new Length(5, Unit.CENTIMETER);
        Length lengthInInches = new Length(2, Unit.INCH);
        assertTrue(lengthInCM.compareTo(lengthInInches));
    }

    @Test
    public void shouldCompareGivenInchAndCentimeterAreNotEqual() {
        Length lengthInCM = new Length(2, Unit.CENTIMETER);
        Length lengthInInches = new Length(12, Unit.INCH);
        assertFalse(lengthInCM.compareTo(lengthInInches));
    }
}
