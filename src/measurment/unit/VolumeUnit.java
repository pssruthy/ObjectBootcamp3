package measurment.unit;

public class VolumeUnit extends Unit {
    public static final VolumeUnit LITER = new VolumeUnit(1);
    public static final VolumeUnit GALLON = new VolumeUnit(3.78);

    private VolumeUnit(double equivalentInLiter) {
        super(equivalentInLiter);
    }
}
