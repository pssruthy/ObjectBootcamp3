package measurment.length;

public enum LengthUnit {
    FEET(12),
    INCH(1),
    CENTIMETER(.4),
    MILLIMETER(.04);

    private final double equivalentInInch;

    LengthUnit(double equivalentInInch) {
        this.equivalentInInch = equivalentInInch;
    }

    public double convertToStandard(double value) {
        return value * this.equivalentInInch;
    }
}
