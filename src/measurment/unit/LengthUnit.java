package measurment.unit;

public enum LengthUnit implements Unit {
    FEET(12),
    INCH(1),
    CENTIMETER(.4),
    MILLIMETER(.04);

    private final double equivalentInInch;

    LengthUnit(double equivalentInInch) {
        this.equivalentInInch = equivalentInInch;
    }

    private double convertToStandard(double value) {
        return value * this.equivalentInInch;
    }
    
    @Override
    public double convertTo(double value, Unit otherUnit) {
        double valueInStandard = this.convertToStandard(value);
        LengthUnit otherInLength = (LengthUnit) otherUnit;
        return valueInStandard / otherInLength.equivalentInInch;
    }
}
