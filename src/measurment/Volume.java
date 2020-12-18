package measurment;

import measurment.unit.VolumeUnit;

public class Volume extends Quantity<VolumeUnit>{
    private final VolumeUnit standardUnit;
    
    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
        this.standardUnit = VolumeUnit.LITER;
    }
    
    public Volume add(Volume other) {
        double otherInBase = other.unit.convertToBase(other.value);
        double thisInBase = this.unit.convertToBase(this.value);
        double sumInBase = this.round(otherInBase + thisInBase);
        double sumInStandard = this.standardUnit.convertFromBase(sumInBase);
        return new Volume(sumInStandard, this.standardUnit);
    }
    
    private double round(double value) {
        return Math.round(value * 100)/100.0;
    }
}
