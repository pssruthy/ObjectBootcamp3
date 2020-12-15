package measurment.volume;

public enum VolumeUnit {
    LITER(1),
    GALLON(3.78);

    private final double equivalentInLiter;

    VolumeUnit(double equivalentInLiter) {
        this.equivalentInLiter = equivalentInLiter;
    }

    public double convertToStandard(double value) {
        return value * this.equivalentInLiter;
    }
}
