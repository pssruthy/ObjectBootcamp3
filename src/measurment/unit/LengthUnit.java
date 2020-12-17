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

    @Override
    public double convertToBase(double value) {
        return value * this.equivalentInInch;
    }

    @Override
    public double convertFromBase(double valueInBase) {
        return valueInBase / this.equivalentInInch;
    }
}
