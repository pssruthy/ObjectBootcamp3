package measurment.length;

import measurment.ComparisonResult;
import measurment.length.Length;
import measurment.length.LengthUnit;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void shouldCompareGivenLengthInInchAndFeetAreEqual() {
        Length lengthInFeet = new Length(1, LengthUnit.FEET);
        Length lengthInInch = new Length(12, LengthUnit.INCH);
        Assert.assertEquals(ComparisonResult.EQUAL,lengthInFeet.compareTo(lengthInInch));
    }
    
    @Test
    public void shouldCompareGivenLengthInFeetIsLesserThanInches() {
        Length lengthInFeet = new Length(2, LengthUnit.FEET);
        Length lengthInInch = new Length(30, LengthUnit.INCH);
        assertEquals(ComparisonResult.LESSER,lengthInFeet.compareTo(lengthInInch));
    }
    
    @Test
    public void shouldCompareGivenLengthsInCentimeterAndInchAreEqual() {
        Length lengthInCM = new Length(5, LengthUnit.CENTIMETER);
        Length lengthInInches = new Length(2, LengthUnit.INCH);
        assertEquals(ComparisonResult.EQUAL,lengthInCM.compareTo(lengthInInches));
    }
    
    @Test
    public void shouldCompareGivenLengthInInchIsGreaterThanCentimeter() {
        Length lengthInCM = new Length(2, LengthUnit.CENTIMETER);
        Length lengthInInch = new Length(12, LengthUnit.INCH);
        assertEquals(ComparisonResult.GREATER, lengthInInch.compareTo(lengthInCM));
    }
    
    @Test
    public void shouldCompareGivenLengthInCentimeterAndMillimeterAreEqual() {
        Length lengthInCM = new Length(1, LengthUnit.CENTIMETER);
        Length lengthInMM = new Length(10, LengthUnit.MILLIMETER);
        assertEquals(ComparisonResult.EQUAL,lengthInCM.compareTo(lengthInMM));
    }
    
    @Test
    public void shouldCompareGivenLengthInCentimeterIsLesserThanMillimeter() {
        Length lengthInCM = new Length(1, LengthUnit.CENTIMETER);
        Length lengthInMM = new Length(11, LengthUnit.MILLIMETER);
        assertEquals(ComparisonResult.LESSER,lengthInCM.compareTo(lengthInMM));
    }

    @Test
    public void shouldEquateWhenTwoLengthsAreEqual() {
        Length length1 = new Length(1, LengthUnit.INCH);
        Length length2 = new Length(1, LengthUnit.INCH);
        assertEquals(length1, length2);
    }

    @Test
    public void shouldNotEquateWhenTwoLengthsAreNotEqual() {
        Length length1 = new Length(1, LengthUnit.INCH);
        Length length2 = new Length(2, LengthUnit.INCH);
        assertNotEquals(length1, length2);
    }
    
    @Test
    public void shouldAddTwoGivenLengthsInSameUnit() {
        Length length1 = new Length(2, LengthUnit.INCH);
        Length length2 = new Length(1, LengthUnit.INCH);
        Length expected = new Length(3, LengthUnit.INCH);
        assertEquals(expected, length1.add(length2));
    }
    
    @Test
    public void shouldAddGivenTwoLengthsInDifferentUnit() {
        Length length1 = new Length(2, LengthUnit.INCH);
        Length length2 = new Length(2.5, LengthUnit.CENTIMETER);
        Length expected = new Length(3, LengthUnit.INCH);
        assertEquals(expected, length1.add(length2));
    }
}
