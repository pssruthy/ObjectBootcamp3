package measurment;

public enum Unit {
    FEET(30),
    INCH(2.5),
    CENTIMETER(1),
    MILLIMETER(0.1);

    private final double equivalentInCentimeter;

    Unit(double equivalentInCentimeter) {
        this.equivalentInCentimeter = equivalentInCentimeter;
    }

    public double convertToStandard(double value) {
        return value * this.equivalentInCentimeter;
    }
}
