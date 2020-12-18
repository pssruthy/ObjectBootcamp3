package measurment;

import measurment.unit.VolumeUnit;

import java.util.Objects;

public class Volume extends AddableQuantity<VolumeUnit>{
    private final VolumeUnit standardUnit;
    
    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
        this.standardUnit = VolumeUnit.LITER;
    }
    
    @Override
    protected AddableQuantity<VolumeUnit> createAddableQuantity(double magnitude, VolumeUnit unit) {
        return new Volume(magnitude, unit);
    }
    
    @Override
    protected VolumeUnit getStandardUnit() {
        return this.standardUnit;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Volume volume = (Volume) o;
        return Objects.equals(standardUnit, volume.standardUnit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), standardUnit);
    }
}
