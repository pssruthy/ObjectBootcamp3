package measurment;

import measurment.unit.Unit;

import java.util.Objects;

public class Quantity<U extends Unit> {
    protected final double value;
    protected final U unit;
    
    public Quantity(double value, U unit) {
        this.value = value;
        this.unit = unit;
    }
    
    public ComparisonResult compareTo(Quantity<U> other) {
        double otherInBase = other.unit.convertToBase(other.value);
        double thisInBase = this.unit.convertToBase(this.value);

        if (thisInBase > otherInBase) {
            return ComparisonResult.GREATER;
        }
        if (thisInBase < otherInBase) {
            return ComparisonResult.LESSER;
        }
        return ComparisonResult.EQUAL;
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
