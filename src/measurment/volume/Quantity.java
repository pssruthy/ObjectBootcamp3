package measurment.volume;

import measurment.ComparisonResult;

import java.util.Objects;

public class Quantity<U extends Measurable> {
    private final double value;
    private final U unit;
    
    public Quantity(double value, U unit) {
        this.value = value;
        this.unit = unit;
    }
    
    public ComparisonResult compareTo(Quantity<U> other) {
        double otherInStandardUnit = other.unit.convertTo(other.value,this.unit);
        double thisInStandardUnit = this.unit.convertToStandard(this.value);
        
        if (thisInStandardUnit == otherInStandardUnit) {
            return ComparisonResult.EQUAL;
        }
        if (thisInStandardUnit < otherInStandardUnit) {
            return ComparisonResult.LESSER;
        }
        return ComparisonResult.GREATER;
    }
    
    public Quantity<Number, U> add(Quantity<Number, U> other) {
        VolumeUnit standardUnit = VolumeUnit.LITER;
        double otherInStandardUnit = other.unit.convertTo(other.value, standardUnit);
        double thisInStandardUnit = this.unit.convertTo(this.value, standardUnit);
        double sum = this.round(thisInStandardUnit + otherInStandardUnit);
        return new Quantity<Number, U>(sum, standardUnit);
    }
    
    private double round(double value) {
        return Math.round(value * 100) / 100.0;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity<Number, U> quantity = (Quantity<Number, U>) o;
        return Double.compare(quantity.value, value) == 0 &&
               unit == quantity.unit;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
