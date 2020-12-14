package comparator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LengthComparatorTest {
    @Test
    public void shouldCompareGivenInchAndFeetAreEqual() {
        LengthComparator lengthComparator = new LengthComparator();
        assertTrue(lengthComparator.compare(1, 12));
    }

    @Test
    public void shouldCompareGivenInchAndFeetAreNotEqual() {
        LengthComparator lengthComparator = new LengthComparator();
        assertFalse(lengthComparator.compare(2, 12));
    }
}
