package measurment;

import measurment.unit.Unit;

import java.util.Objects;

public class Quantity<U extends Unit> {
    private final double value;
    private final U unit;
    
    public Quantity(double value, U unit) {
        this.value = value;
        this.unit = unit;
    }
    
    public ComparisonResult compareTo(Quantity<U> other) {
        double convertedValue = other.unit.convertTo(other.value,this.unit);
        
        if (this.value > convertedValue) {
            return ComparisonResult.GREATER;
        }
        if (this.value < convertedValue) {
            return ComparisonResult.LESSER;
        }
        return ComparisonResult.EQUAL;
    }
    
    public Quantity<U> add(Quantity<U> other,U standardUnit) {
        double otherInStandardUnit = other.unit.convertTo(other.value,standardUnit);
        double thisInStandardUnit = this.unit.convertTo(this.value,standardUnit);
        double sum = this.round(otherInStandardUnit + thisInStandardUnit);
        return new Quantity<>(sum, standardUnit);
    }
    
    private double round(double value) {
        return Math.round(value * 100)/100.0;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity<?> quantity = (Quantity<?>) o;
        return Double.compare(quantity.value, value) == 0 &&
               Objects.equals(unit, quantity.unit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
