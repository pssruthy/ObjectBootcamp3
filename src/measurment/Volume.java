package measurment;

public class Volume {
    private final double value;
    private final VolumeUnit unit;

    public Volume(double value, VolumeUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public ComparisonResult compareTo(Volume other) {
        double otherInStandardUnit = other.unit.convertToStandard(other.value);
        double thisInStandardUnit = this.unit.convertToStandard(this.value);

        if(thisInStandardUnit == otherInStandardUnit){
            return ComparisonResult.EQUAL;
        }
        if(thisInStandardUnit < otherInStandardUnit){
            return ComparisonResult.LESSER;
        }
        return ComparisonResult.GREATER;
    }
}
