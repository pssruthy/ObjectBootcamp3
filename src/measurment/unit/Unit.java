package measurment.unit;

public interface Unit {
    double convertToBase(double value);
    double convertFromBase(double valueInBase);
}
