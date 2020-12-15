package measurment;

import java.util.Objects;

public class Length {
    private final double value;
    private final Unit unit;
    
    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }
    
    public ComparisonResult compareTo(Length other) {
        double otherInStandardUnit = other.unit.convertToStandard(other.value);
        double thisInStandardUnit = this.unit.convertToStandard(this.value);

        if(otherInStandardUnit == thisInStandardUnit){
            return ComparisonResult.EQUAL;
        }
        if(otherInStandardUnit < thisInStandardUnit){
            return ComparisonResult.LESSER;
        }
        return ComparisonResult.GREATER;
    }

    public Length add(Length other) {
        return new Length(this.value + other.value, this.unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
