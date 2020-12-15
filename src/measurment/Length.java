package measurment;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnit lengthUnit;
    
    public Length(double value, LengthUnit lengthUnit) {
        this.value = value;
        this.lengthUnit = lengthUnit;
    }
    
    public ComparisonResult compareTo(Length other) {
        double otherInStandardUnit = other.lengthUnit.convertToStandard(other.value);
        double thisInStandardUnit = this.lengthUnit.convertToStandard(this.value);

        if(thisInStandardUnit == otherInStandardUnit){
            return ComparisonResult.EQUAL;
        }
        if(thisInStandardUnit < otherInStandardUnit){
            return ComparisonResult.LESSER;
        }
        return ComparisonResult.GREATER;
    }

    public Length add(Length other) {
        return new Length(this.value + other.value, this.lengthUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                lengthUnit == length.lengthUnit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, lengthUnit);
    }
}
