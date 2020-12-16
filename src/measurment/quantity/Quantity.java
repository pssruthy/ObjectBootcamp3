package measurment.quantity;

import measurment.ComparisonResult;

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
}
