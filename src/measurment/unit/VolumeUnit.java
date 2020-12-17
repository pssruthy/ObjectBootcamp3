package measurment.unit;

public enum VolumeUnit implements Unit {
    LITER(1),
    GALLON(3.78);

    private final double equivalentInLiter;

    VolumeUnit(double equivalentInLiter) {
        this.equivalentInLiter = equivalentInLiter;
    }

    @Override
    public double convertToBase(double value) {
        return value * this.equivalentInLiter;
    }

    @Override
    public double convertFromBase(double valueInBase) {
        return valueInBase / this.equivalentInLiter;
    }
}
