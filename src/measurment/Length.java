package measurment;

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
        else if(otherInStandardUnit < thisInStandardUnit){
            return ComparisonResult.LESSER;
        }
        return ComparisonResult.GREATER;
    }
}
