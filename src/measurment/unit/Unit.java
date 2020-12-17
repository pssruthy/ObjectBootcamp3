package measurment.unit;

public class Unit {
    private final double baseValue;

    protected Unit(double baseValue) {
        this.baseValue = baseValue;
    }

    public double convertToBase(double value) {
        return value * this.baseValue;
    }

    public double convertFromBase(double valueInBase) {
        return valueInBase / this.baseValue;
    }
}
