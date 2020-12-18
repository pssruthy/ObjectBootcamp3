package measurment.addabale.volume;

import measurment.addabale.AddableQuantity;

public class Volume extends AddableQuantity<VolumeUnit> {
    
    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }
    
    @Override
    protected AddableQuantity<VolumeUnit> createAddableQuantity(double magnitude, VolumeUnit unit) {
        return new Volume(magnitude, unit);
    }
    
    @Override
    protected VolumeUnit getStandardUnit() {
        return VolumeUnit.LITER;
    }
}
