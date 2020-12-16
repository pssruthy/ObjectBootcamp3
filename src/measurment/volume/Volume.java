package measurment.volume;

import measurment.ComparisonResult;

import java.util.Objects;

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
        
        if (thisInStandardUnit == otherInStandardUnit) {
            return ComparisonResult.EQUAL;
        }
        if (thisInStandardUnit < otherInStandardUnit) {
            return ComparisonResult.LESSER;
        }
        return ComparisonResult.GREATER;
    }
    
    public Volume add(Volume other) {
        VolumeUnit standardUnit = VolumeUnit.LITER;
        double otherInStandardUnit = other.unit.convertTo(other.value, standardUnit);
        double thisInStandardUnit = this.unit.convertTo(this.value, standardUnit);
        double sum = this.round(thisInStandardUnit + otherInStandardUnit);
        return new Volume(sum, standardUnit);
    }
    
    private double round(double value) {
        return Math.round(value * 100) / 100.0;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 &&
               unit == volume.unit;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
