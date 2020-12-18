package measurment;

import measurment.unit.LengthUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthTest {
    
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
