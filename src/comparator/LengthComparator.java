package comparator;

public class LengthComparator {
    private final double oneFeetInInches;

    public LengthComparator() {
        this.oneFeetInInches = 12;
    }

    public boolean compare(double lengthInFeet, double lengthInInches) {
        double feetInInches = lengthInFeet * 12;
        return feetInInches == lengthInInches;
    }
}
