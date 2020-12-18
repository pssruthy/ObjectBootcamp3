package measurment;

import measurment.unit.VolumeUnit;

public class Volume extends Quantity<VolumeUnit>{
    private final VolumeUnit standardUnit;
    
    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
        this.standardUnit = VolumeUnit.LITER;
    }
    
    public Volume add(Volume other) {
        double sumInBase =other.convertToBase() + this.convertToBase();
        double sumInStandard = this.standardUnit.convertFromBase(sumInBase);
        return new Volume(sumInStandard, this.standardUnit);
    }
}
