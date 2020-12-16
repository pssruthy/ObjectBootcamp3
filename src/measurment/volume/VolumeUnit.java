package measurment.volume;

public enum VolumeUnit implements Measurable {
    LITER(1),
    GALLON(3.78);

    private final double equivalentInLiter;

    VolumeUnit(double equivalentInLiter) {
        this.equivalentInLiter = equivalentInLiter;
    }

    public double convertToStandard(double value) {
        return value * this.equivalentInLiter;
    }
    
    @Override
    public double convertTo(double value, Measurable otherUnit) {
        double valueInStandard = this.convertToStandard(value);
        return valueInStandard / otherUnit.equivalentInLiter;
    }
}
