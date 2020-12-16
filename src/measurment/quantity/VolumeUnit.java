package measurment.quantity;

public enum VolumeUnit implements Unit {
    LITER(1),
    GALLON(3.78);

    private final double equivalentInLiter;

    VolumeUnit(double equivalentInLiter) {
        this.equivalentInLiter = equivalentInLiter;
    }

    private double convertToStandard(double value) {
        return value * this.equivalentInLiter;
    }
    
    @Override
    public double convertTo(double value, Unit otherUnit) {
        double valueInStandard = this.convertToStandard(value);
        VolumeUnit otherInVolume = (VolumeUnit) otherUnit;
        return valueInStandard / otherInVolume.equivalentInLiter;
    }
}
